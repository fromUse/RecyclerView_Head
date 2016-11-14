package pushsummary.jzs.com.recyclerview_head;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersDecoration;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recylerview;
    private String url = "http://api.funwear.com/mbfun_server/index.php?m=BrandMb&a=getAppBrandListWithSort&osVersion=22&appName=youfanguanfang&source=android&osName=YQ601&version=v4.2.2&deviceId=00000000-35fa-0db9-0da8-19f962cce3ff&cid=1&token=&osCode=android";
    private List<DataBean.DataEntity.BrandInfoEntity> alldata = new ArrayList<>();
    private DataAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        1.控件的初始化
        initView();
        //2.数据的请求
        initData();

        //3.设置适配器
        adapter = new DataAdapter(this, alldata);
        recylerview.setAdapter(adapter);
        adapter.addBean(alldata, this);
        recylerview.setLayoutManager(new LinearLayoutManager(this));

        StickyRecyclerHeadersDecoration headersDecor = new StickyRecyclerHeadersDecoration(adapter);
        recylerview.addItemDecoration(headersDecor);
    }

    private void initData() {

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        StringRequest request = new StringRequest(url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Log.e("TAG", "请求数据成功" + response);

                //解析数据
                Gson s = new Gson();
                DataBean data = s.fromJson(response, DataBean.class);
                for (int i = 0; i < data.getData().size(); i++) {
                    alldata.addAll(data.getData().get(i).getBrandInfo());
                }

                Log.e("TAG", "数据的长度" + alldata.size());
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });

        requestQueue.add(request);
    }

    private void initView() {
        recylerview = (RecyclerView) findViewById(R.id.recylerview);
    }
}
