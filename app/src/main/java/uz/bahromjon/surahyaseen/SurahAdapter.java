package uz.bahromjon.surahyaseen;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SurahAdapter extends BaseAdapter {

    private List<Surah> yaSeen;
    private Context context;

    public SurahAdapter(Context context, List<Surah> yaSeen) {
        this.context = context;
        this.yaSeen = yaSeen;
    }

    @Override
    public int getCount() {
        return yaSeen.size();
    }

    @Override
    public Object getItem(int position) {
        return yaSeen.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = LayoutInflater.from(context).inflate(R.layout.ayat_surah, parent, false);

        TextView num = convertView.findViewById(R.id.txt_num_ayat_surah);
        TextView ayat = convertView.findViewById(R.id.txt_ayat_surah);

        num.setText(String.valueOf(yaSeen.get(position).getNumOfAyat()));
        ayat.setText(yaSeen.get(position).getAyat());

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setTitle(yaSeen.get(position).getNumOfAyat() + "-oyat");
                builder.setMessage(yaSeen.get(position).getAyat());
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                builder.show();
            }
        });


        return convertView;
    }
}
