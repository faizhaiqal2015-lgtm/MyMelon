package com.melonfarm.planner;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ScrollView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout main = new LinearLayout(this);
        main.setOrientation(LinearLayout.VERTICAL);
        main.setPadding(24, 24, 24, 24);
        main.setBackgroundColor(Color.WHITE);

        TextView title = new TextView(this);
        title.setText("🍈 MY MELON");
        title.setTextSize(28);
        title.setTextColor(Color.rgb(46, 125, 50));
        title.setGravity(Gravity.CENTER);
        title.setPadding(0, 20, 0, 30);

        main.addView(title);

        TextView subtitle = new TextView(this);
        subtitle.setText("Jadual Penanaman Melon");
        subtitle.setTextSize(20);
        subtitle.setTextColor(Color.DKGRAY);
        subtitle.setPadding(0, 0, 0, 25);

        main.addView(subtitle);

        addRow(main, "Hari 1", "Tanam / Lilit", "EC 1.8", "Timer 1");
        addRow(main, "Hari 8", "Potong Sulur 1–6", "EC 1.8", "Timer 2");
        addRow(main, "Hari 15", "Lilit Pokok", "EC 2.0", "Timer 3");
        addRow(main, "Hari 22", "Kahwin Pokok", "EC 2.2", "Timer 4");
        addRow(main, "Hari 33", "Pilih Buah", "EC 2.5", "Timer 5");

        TextView info = new TextView(this);
        info.setText(
                "\nJadual kerja harian\n\n" +
                "🌱 Kerja\n" +
                "💧 EC\n" +
                "💊 Racun\n" +
                "⏱ Timer / Kekerapan\n" +
                "👤 Tugasan\n" +
                "✅ Kehadiran\n" +
                "🔄 Penggantian"
        );
        info.setTextSize(17);
        info.setTextColor(Color.DKGRAY);

        main.addView(info);

        ScrollView scroll = new ScrollView(this);
        scroll.addView(main);

        setContentView(scroll);
    }

    private void addRow(
            LinearLayout parent,
            String hari,
            String kerja,
            String ec,
            String timer) {

        TextView row = new TextView(this);

        row.setText(
                hari + "\n" +
                "Kerja: " + kerja + "\n" +
                ec + "    " + timer
        );

        row.setTextSize(17);
        row.setTextColor(Color.DKGRAY);
        row.setPadding(20, 20, 20, 20);
        row.setBackgroundColor(Color.rgb(235, 247, 236));

        LinearLayout.LayoutParams params =
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                );

        params.setMargins(0, 0, 0, 15);

        parent.addView(row, params);
    }
}
