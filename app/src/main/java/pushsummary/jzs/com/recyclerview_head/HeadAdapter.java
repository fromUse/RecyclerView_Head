package pushsummary.jzs.com.recyclerview_head;

import android.content.Context;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;



public abstract class HeadAdapter<VH extends RecyclerView.ViewHolder>
        extends RecyclerView.Adapter<VH> {
    private ArrayList<String> items = new ArrayList<String>();
    public List<DataBean.DataEntity.BrandInfoEntity> data;
    public Context context;

    public HeadAdapter() {
        setHasStableIds(true);
    }



    public void addBean(List<DataBean.DataEntity.BrandInfoEntity> data, Context context) {
        this.data = data;
        this.context = context;
        notifyDataSetChanged();
    }

    public void add(int index, String object) {
        items.add(index, object);
        notifyDataSetChanged();
    }

    public void addAll(Collection<? extends String> collection) {
        if (collection != null) {
            items.addAll(collection);
            notifyDataSetChanged();
        }
    }

    public void addAll(String... items) {
        addAll(Arrays.asList(items));
    }

    public void clear() {
        items.clear();
        notifyDataSetChanged();
    }

    public void remove(String object) {
        items.remove(object);
        notifyDataSetChanged();
    }

    public String getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return data.get(position).getBranD_NAME().hashCode();
    }

    @Override
    public int getItemCount() {

        return data.size();
    }
}
