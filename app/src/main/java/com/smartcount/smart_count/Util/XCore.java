package com.smartcount.smart_count.Util;

import android.content.Context;
import android.graphics.Color;

import com.geniusforapp.fancydialog.FancyAlertDialog;
import com.smartcount.smart_count.R;

/**
 * Created by jeremiah.imo on 6/6/2018.
 */

public class XCore {

    public static FancyAlertDialog.Builder dialog(Context context, String title, String body,
                                                  FancyAlertDialog.OnPositiveClicked callback,
                                                  FancyAlertDialog.OnNegativeClicked callback2,
                                                  String yesMessage, String noMessage) {

        FancyAlertDialog.Builder alert = new FancyAlertDialog.Builder(context)
                .setPositiveButtonFont("font/futura-medium.ttf")
                .setNegativeButtonFont("font/futura-medium.ttf")
                .setTitleFont("font/futura-medium.ttf")
                .setSubTitleFont("font/futura-medium.ttf")
                .setTextSubTitle(title)
                .setBody(body)
                .setBodyFont("font/futura.ttf")
                .setBodyColor(Color.BLACK)
                .setBodyColor(R.color.smartcount_black_btn)
                .setNegativeColor(R.color.smartcount_black_btn)
                .setNegativeButtonText(noMessage)
                .setOnNegativeClicked(callback2)
                .setPositiveButtonText(yesMessage)
                .setPositiveColor(R.color.smartcount_blue_btn)
                .setOnPositiveClicked(callback)
                .setButtonsGravity(FancyAlertDialog.PanelGravity.LEFT)
                .setBodyGravity(FancyAlertDialog.TextGravity.CENTER)
                .setTitleGravity(FancyAlertDialog.TextGravity.CENTER)
                .setSubtitleGravity(FancyAlertDialog.TextGravity.CENTER)
                .setCancelable(false)
                .build();

        return alert;
    }

    public static FancyAlertDialog.Builder confirm(Context context, String title, String body,
                                                   FancyAlertDialog.OnPositiveClicked callback,
                                                   FancyAlertDialog.OnNegativeClicked callback2,
                                                   String yesMessage, String noMessage) {

        FancyAlertDialog.Builder alert = new FancyAlertDialog.Builder(context)
                .setPositiveButtonFont("font/futura-medium.ttf")
                .setNegativeButtonFont("font/futura-medium.ttf")
                .setTitleFont("font/futura-medium.ttf")
                .setSubTitleFont("font/futura-medium.ttf")
                .setTextSubTitle(title)
                .setBody(body)
                .setBodyFont("font/futura.ttf")
                .setBodyColor(Color.BLACK)
                .setBodyColor(R.color.smartcount_black_btn)
                .setNegativeColor(R.color.smartcount_black_btn)
                .setNegativeButtonText(noMessage)
                .setOnNegativeClicked(callback2)
                .setPositiveButtonText(yesMessage)
                .setPositiveColor(R.color.smartcount_blue_btn)
                .setOnPositiveClicked(callback)
                .setButtonsGravity(FancyAlertDialog.PanelGravity.CENTER)
                .setBodyGravity(FancyAlertDialog.TextGravity.CENTER)
                .setTitleGravity(FancyAlertDialog.TextGravity.CENTER)
                .setSubtitleGravity(FancyAlertDialog.TextGravity.CENTER)
                .setCancelable(false)
                .build();

        return alert;
    }

    public static FancyAlertDialog.Builder confirmCancel(Context context, String title, String body,
                                                         FancyAlertDialog.OnPositiveClicked callback,
                                                         FancyAlertDialog.OnNegativeClicked callback2,
                                                         String yesMessage, String noMessage) {

        FancyAlertDialog.Builder alert = new FancyAlertDialog.Builder(context)
                .setPositiveButtonFont("font/futura-medium.ttf")
                .setNegativeButtonFont("font/futura-medium.ttf")
                .setTitleFont("font/futura-medium.ttf")
                .setSubTitleFont("font/futura-medium.ttf")
                .setTextSubTitle(title)
                .setBody(body)
                .setBodyFont("font/futura.ttf")
                .setBodyColor(Color.BLACK)
                .setBodyColor(R.color.smartcount_black_btn)
                .setNegativeColor(R.color.smartcount_black_btn)
                .setNegativeButtonText(noMessage)
                .setOnNegativeClicked(callback2)
                .setPositiveButtonText(yesMessage)
                .setPositiveColor(R.color.smartcount_blue_btn)
                .setOnPositiveClicked(callback)
                .setButtonsGravity(FancyAlertDialog.PanelGravity.CENTER)
                .setBodyGravity(FancyAlertDialog.TextGravity.CENTER)
                .setTitleGravity(FancyAlertDialog.TextGravity.CENTER)
                .setSubtitleGravity(FancyAlertDialog.TextGravity.CENTER)
                .setCancelable(true)
                .build();

        return alert;
    }

    public static FancyAlertDialog.Builder dialog(Context context, String title, String body,                                                   FancyAlertDialog.OnPositiveClicked callback,
                                                  String yesMessage, String noMessage) {

        FancyAlertDialog.Builder alert = new FancyAlertDialog.Builder(context)
                .setPositiveButtonFont("font/futura-medium.ttf")
                .setTitleFont("font/futura-medium.ttf")
                .setSubTitleFont("font/futura-medium.ttf")
                .setTextSubTitle(title)
                .setBody(body)
                .setBodyFont("font/futura.ttf")
                .setBodyColor(Color.BLACK)
                .setBodyColor(R.color.smartcount_black_btn)
                .setNegativeColor(R.color.smartcount_black_btn)
                .setPositiveButtonText(yesMessage)
                .setPositiveColor(R.color.smartcount_blue_btn)
                .setOnPositiveClicked(callback)
                .setButtonsGravity(FancyAlertDialog.PanelGravity.CENTER)
                .setBodyGravity(FancyAlertDialog.TextGravity.CENTER)
                .setTitleGravity(FancyAlertDialog.TextGravity.CENTER)
                .setSubtitleGravity(FancyAlertDialog.TextGravity.CENTER)
                .setCancelable(false)
                .build();

        return alert;
    }

    public static FancyAlertDialog.Builder message(Context context, String title, String body,                                                   FancyAlertDialog.OnPositiveClicked callback,
                                                   String yesMessage, String noMessage) {

        FancyAlertDialog.Builder alert = new FancyAlertDialog.Builder(context)
                .setPositiveButtonFont("font/futura-medium.ttf")
                .setTitleFont("font/futura-medium.ttf")
                .setSubTitleFont("font/futura-medium.ttf")
                .setTextSubTitle(title)
                .setBody(body)
                .setBodyFont("font/futura.ttf")
                .setBodyColor(Color.BLACK)
                .setBodyColor(R.color.smartcount_blue_btn)
                .setNegativeColor(R.color.smartcount_black_btn)
                .setPositiveButtonText(yesMessage)
                .setPositiveColor(R.color.smartcount_blue_btn)
                .setOnPositiveClicked(callback)
                .setButtonsGravity(FancyAlertDialog.PanelGravity.CENTER)
                .setBodyGravity(FancyAlertDialog.TextGravity.LEFT)
                .setTitleGravity(FancyAlertDialog.TextGravity.CENTER)
                .setSubtitleGravity(FancyAlertDialog.TextGravity.CENTER)
                .setCancelable(false)
                .build();

        return alert;
    }
}
