package com.example.asmt_ta2_desafio;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Toast;

import com.github.sundeepk.compactcalendarview.CompactCalendarView;
import com.github.sundeepk.compactcalendarview.domain.Event;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Calendario extends AppCompatActivity {

    CompactCalendarView compactCalendar;
    private SimpleDateFormat dateFormatMonth = new SimpleDateFormat("MMMM-yyyy", Locale.getDefault());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendario);

        final ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(false);
        actionBar.setTitle(null);

        compactCalendar = (CompactCalendarView) findViewById(R.id.compactcalendar_view);
        compactCalendar.setUseThreeLetterAbbreviation(true);
        compactCalendar.setFirstDayOfWeek(Calendar.SUNDAY);

        Event ev1 = new Event(Color.RED, 1573911000000L, "Desayuno Familiar en Aloha");
        compactCalendar.addEvent(ev1);

        compactCalendar.setListener(new CompactCalendarView.CompactCalendarViewListener() {
            @Override
            public void onDayClick(Date dateClicked) {
                Context context = getApplicationContext();
                if (dateClicked.toString().compareTo("Sat Nov 16 00:00:00 GMT 2019") == 0) {
                    Toast.makeText(context, "Desayuno Familiar en Aloha.\nHora: 08h30 AM\nLugar: Centro Comercial La Gran Manzana", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(context, "No hay eventos planificados en este día", Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void onMonthScroll(Date firstDayOfNewMonth) {
                actionBar.setTitle(dateFormatMonth.format(firstDayOfNewMonth));
            }
        });
    }
}

