package com.tsma.worstone.tsma;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class Adptr extends RecyclerView.Adapter<Adptr.ViewHolder> {


    public Adptr(List<card> list, Context mcontext) {
        this.list = list;
        this.mcontext = mcontext;
    }

    List<card> list;
    private Context mcontext;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        int micon = list.get(position).getMicon();
        int mback = list.get(position).getMback();
        String mtitle = list.get(position).getMtitle();
        holder.setData(micon,mtitle,mback);
        holder.open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (position){
                    case 0  :
                        if(isAppInstalled(mcontext.getApplicationContext(), "com.facebook.katana")) {
                            Toast.makeText(mcontext,"Facebook",Toast.LENGTH_LONG).show();
                            Intent i = mcontext.getPackageManager().getLaunchIntentForPackage("com.facebook.katana");
                            mcontext.startActivity(i);
                        }else {
                            Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                            i.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.facebook.katana"));
                            mcontext.startActivity(i);
                        }
                        break;
                    case 4:
                        if(isAppInstalled(mcontext.getApplicationContext(), "com.whatsapp")) {
                            Toast.makeText(mcontext,"Whatsapp",Toast.LENGTH_LONG).show();
                            Intent i = mcontext.getPackageManager().getLaunchIntentForPackage("com.whatsapp");
                            mcontext.startActivity(i);
                        }else {
                            Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                            i.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.whatsapp"));
                            mcontext.startActivity(i);
                        }
                        break;
                    case 2:
                        if(isAppInstalled(mcontext.getApplicationContext(), "com.instagram.android")) {
                            Toast.makeText(mcontext,"Instagram",Toast.LENGTH_LONG).show();
                            Intent i = mcontext.getPackageManager().getLaunchIntentForPackage("com.instagram.android");
                            mcontext.startActivity(i);
                        }else {
                            Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                            i.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.instagram.android"));
                            mcontext.startActivity(i);
                        }
                        break;
                    case 7:
                        if(isAppInstalled(mcontext.getApplicationContext(), "com.google.android.talk")) {
                            Toast.makeText(mcontext,"Hangout",Toast.LENGTH_LONG).show();
                            Intent i = mcontext.getPackageManager().getLaunchIntentForPackage("com.google.android.talk");
                            mcontext.startActivity(i);
                        }else {
                            Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                            i.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.talk"));
                            mcontext.startActivity(i);
                        }
                        break;
                    case 5:
                        if(isAppInstalled(mcontext.getApplicationContext(), "com.snapchat.android")) {
                            Toast.makeText(mcontext,"Snapchat",Toast.LENGTH_LONG).show();
                            Intent i = mcontext.getPackageManager().getLaunchIntentForPackage("com.snapchat.android");
                            mcontext.startActivity(i);
                        }else {
                            Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                            i.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.snapchat.android"));
                            mcontext.startActivity(i);
                        }
                        break;
                    case 1:
                        if(isAppInstalled(mcontext.getApplicationContext(), "com.bsb.hike")) {
                            Toast.makeText(mcontext,"Hike",Toast.LENGTH_LONG).show();
                            Intent i = mcontext.getPackageManager().getLaunchIntentForPackage("com.bsb.hike");
                            mcontext.startActivity(i);
                        }else {
                            Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                            i.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.bsb.hike"));
                            mcontext.startActivity(i);
                        }
                        break;
                    case 6:
                        if(isAppInstalled(mcontext.getApplicationContext(), "com.twitter.android")) {
                            Toast.makeText(mcontext,"Twitter",Toast.LENGTH_LONG).show();
                            Intent i = mcontext.getPackageManager().getLaunchIntentForPackage("com.twitter.android");
                            mcontext.startActivity(i);
                        }else {
                            Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                            i.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.twitter.android"));
                            mcontext.startActivity(i);
                        }
                        break;
                    case 8:
                        if(isAppInstalled(mcontext.getApplicationContext(), "org.telegram.messenger")) {
                            Toast.makeText(mcontext,"Telegram",Toast.LENGTH_LONG).show();
                            Intent i = mcontext.getPackageManager().getLaunchIntentForPackage("org.telegram.messenger");
                            mcontext.startActivity(i);
                        }else {
                            Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                            i.setData(Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger"));
                            mcontext.startActivity(i);
                        }
                        break;
                    case 9:
                        if(isAppInstalled(mcontext.getApplicationContext(), "kik.android")) {
                            Toast.makeText(mcontext,"KIK",Toast.LENGTH_LONG).show();
                            Intent i = mcontext.getPackageManager().getLaunchIntentForPackage("kik.android");
                            mcontext.startActivity(i);
                        }else {
                            Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                            i.setData(Uri.parse("https://play.google.com/store/apps/details?id=kik.android"));
                            mcontext.startActivity(i);
                        }
                        break;
                    case 3:
                        if(isAppInstalled(mcontext.getApplicationContext(), "com.facebook.orca")) {
                            Toast.makeText(mcontext,"Messenger",Toast.LENGTH_LONG).show();
                            Intent i = mcontext.getPackageManager().getLaunchIntentForPackage("com.facebook.orca");
                            mcontext.startActivity(i);
                        }else {
                            Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                            i.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.facebook.orca"));
                            mcontext.startActivity(i);
                        }
                        break;
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    private static boolean isAppInstalled(Context c, String targetPackage) {
        PackageManager pm = c.getPackageManager();
        try {
            PackageInfo info = pm.getPackageInfo(targetPackage, PackageManager.GET_META_DATA);
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
        return true;
    }


    class ViewHolder extends RecyclerView.ViewHolder{


        private ImageView micon;
        private TextView mtitle;
        private ImageView mback;
        private Button open;

        public ViewHolder(final View itemView) {
            super(itemView);

            micon = itemView.findViewById(R.id.imageView3);
            mtitle = itemView.findViewById(R.id.textView);
            mback = itemView.findViewById(R.id.imageView);
            open = itemView.findViewById(R.id.button);
        }

        private void setData(int icon,String title,int back){
            micon.setImageResource(icon);
            mtitle.setText(title);
            mback.setImageResource(back);
        }
    }
}