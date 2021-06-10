package com.teddy.dermanineskincare;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class  PromoActivity extends AppCompatActivity {

    //Memanggil Variabel Widget Drawer supaya bisa dicoding
    //Inisialiasi Variabel
    DrawerLayout drawerLayout;
    WebView webView;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promo);

        //buka webnya
        webView = (WebView) findViewById(R.id.promo_webview);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.dermanine.com/promo/");

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        //assign variabelnya
        drawerLayout = findViewById(R.id.drawer_layout);

    }

    public void ClickMenu(View view){
        //Open drawer
        MainActivity.openDrawer (drawerLayout);
    }

    public void ClickLogo(View view){
        //Close Drawernya
        MainActivity.closeDrawer(drawerLayout);
    }

    public void ClickHome(View view){
        //Redirect activity ke Beranda
        MainActivity.redirectActivity(this,MainActivity.class);
    }

    public void ClickLogin(View view){
        //Redirect activity ke Beranda
        MainActivity.redirectActivity(this,LoginActivity.class);
    }

    public void ClickCompany (View view){
        //Redirect activity ke info Perusahaan
        MainActivity.redirectActivity(this,CompanyActivity.class);
    }

    public void ClickProduk (View view){
        //Redirect activity ke Produk
        MainActivity.redirectActivity(this,ProdukActivity.class);
    }

    public void ClickPromo (View view){
        //Recreate activity
        recreate();
    }

    public void ClickTestimoni (View view){
        //Redirect activity ke Testimoni
        MainActivity.redirectActivity(this,TestimoniActivity.class);
    }

    public void ClickInfoTerkini (View view){
        //Redirect activity ke Info Terkini
        MainActivity.redirectActivity(this,InfoTerkiniActivity.class);
    }

    public void ClickAgen (View view){
        //Redirect activity ke Agen Kulit Sehat
        MainActivity.redirectActivity(this,AgenActivity.class);
    }

    public void ClickTop (View view){
        //Redirect activity ke Top Achiever
        MainActivity.redirectActivity(this,TopActivity.class);
    }

    public void ClickSyarat (View view){
        //Redirect activity ke Syarat Reseller
        MainActivity.redirectActivity(this,SyaratActivity.class);
    }

    public void ClickList (View view){
        //Redirect activity ke Daftar Reseller Indonesia
        MainActivity.redirectActivity(this,ListActivity.class);
    }

    public void ClickKontak (View view){
        //Redirect activity ke Kontak Kami
        MainActivity.redirectActivity(this,KontakActivity.class);
    }

    public void ClickTentang (View view){
        //Redirect activity ke Tentang Aplikasi
        MainActivity.redirectActivity(this,TentangActivity.class);
    }

    public void ClickLogout (View view){
        //Menutup Aplikasi
        MainActivity.logout(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        //Close Drawer
        MainActivity.closeDrawer(drawerLayout);
    }

}