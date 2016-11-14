package pushsummary.jzs.com.recyclerview_head;

import android.content.Context;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersAdapter;

import java.util.List;

/**
 * Created by a on 2016/11/14.
 */
public class DataAdapter extends HeadAdapter implements StickyRecyclerHeadersAdapter {
    Context mcontext;
    List<DataBean.DataEntity.BrandInfoEntity> mdata;

    public DataAdapter(Context context, List<DataBean.DataEntity.BrandInfoEntity> data) {
        mcontext = context;
        mdata = data;

    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(mcontext, R.layout.list_list_view, null);

        return new Myhead1(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Myhead1 myhead1 = (Myhead1) holder;
        myhead1.tv_item_name.setText(mdata.get(position).getEname());
        myhead1.tv_item_ename.setText(mdata.get(position).getCname());
    }

    /**
     * 返回要显示的头部ID
     * @param position the position of the view to get the header ID of
     * @return
     */
    @Override
    public long getHeaderId(int position) {
        return mdata.get(position).getFirst_letter().charAt(0);
    }


    /**
     * 加载要显示的头部布局
     * @param parent the view to create a header view holder for
     * @return
     */
    @Override
    public RecyclerView.ViewHolder onCreateHeaderViewHolder(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.quik_item, parent, false);
        return new Myhead(view);
    }

    /**
     * 设置显示的内容
     * @param holder the view holder
     * @param position the adapter position
     */
    @Override
    public void onBindHeaderViewHolder(RecyclerView.ViewHolder holder, int position) {
        Myhead myhead = (Myhead) holder;
        myhead.tv_item_word.setText(mdata.get(position).getFirst_letter());
    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }

    class Myhead1 extends RecyclerView.ViewHolder {
        TextView tv_item_name;
        TextView tv_item_ename;

        public Myhead1(View itemView) {
            super(itemView);
            tv_item_name = (TextView) itemView.findViewById(R.id.tv_item_name);
            tv_item_ename = (TextView) itemView.findViewById(R.id.tv_item_ename);

        }
    }

    /**
     * 头部适配器
     */
    class Myhead extends RecyclerView.ViewHolder {

        private TextView tv_item_word;

        public Myhead(View itemView) {
            super(itemView);
            tv_item_word = (TextView) itemView.findViewById(R.id.tv_item_word);

        }
    }


}
