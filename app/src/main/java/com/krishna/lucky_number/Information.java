package com.krishna.lucky_number;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;

import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Information extends AppCompatActivity {

    public AppCompatButton btn_1;
    public AppCompatButton btn_2;
    public AppCompatButton btn_3;
    public AppCompatButton btn_4;
    public AppCompatButton btn_5;
    public AppCompatButton btn_6;
    public AppCompatButton btn_7;
    public AppCompatButton btn_8;
    public AppCompatButton btn_9;

    public AppCompatTextView textViewinfo_dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        btn_1 = (AppCompatButton) findViewById(R.id.btn_1);
        btn_2 = (AppCompatButton) findViewById(R.id.btn_2);
        btn_3 = (AppCompatButton) findViewById(R.id.btn_3);
        btn_4 = (AppCompatButton) findViewById(R.id.btn_4);
        btn_5 = (AppCompatButton) findViewById(R.id.btn_5);
        btn_6 = (AppCompatButton) findViewById(R.id.btn_6);
        btn_7 = (AppCompatButton) findViewById(R.id.btn_7);
        btn_8 = (AppCompatButton) findViewById(R.id.btn_8);
        btn_9 = (AppCompatButton) findViewById(R.id.btn_9);

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Information.this);
                ViewGroup viewGroup = findViewById(android.R.id.content);
                View dialogView = LayoutInflater.from(v.getContext()).inflate(R.layout.custom_dialog, viewGroup, false);
                textViewinfo_dialog =(AppCompatTextView) dialogView.findViewById(R.id.textViewinfo_dialog);
                Button btn_cancel = (Button) dialogView.findViewById(R.id.btn_cancel);
                Button btn_okay = (Button) dialogView.findViewById(R.id.btn_okay);
                builder.setView(dialogView);
                textViewinfo_dialog.setText(Html.fromHtml(getString(R.string.info_1)));
                AlertDialog alertDialog = builder.create();
                alertDialog.setCanceledOnTouchOutside(false);
                btn_cancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alertDialog.dismiss();
                    }
                });
                btn_okay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alertDialog.dismiss();
                    }
                });
                alertDialog.show();
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Information.this);
                ViewGroup viewGroup = findViewById(android.R.id.content);
                View dialogView = LayoutInflater.from(v.getContext()).inflate(R.layout.custom_dialog, viewGroup, false);
                textViewinfo_dialog =(AppCompatTextView) dialogView.findViewById(R.id.textViewinfo_dialog);
                Button btn_cancel = (Button) dialogView.findViewById(R.id.btn_cancel);
                Button btn_okay = (Button) dialogView.findViewById(R.id.btn_okay);
                builder.setView(dialogView);
                textViewinfo_dialog.setText(Html.fromHtml(getString(R.string.info_2)));
                AlertDialog alertDialog = builder.create();
                alertDialog.setCanceledOnTouchOutside(false);
                btn_cancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alertDialog.dismiss();
                    }
                });
                btn_okay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alertDialog.dismiss();
                    }
                });
                alertDialog.show();
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Information.this);
                ViewGroup viewGroup = findViewById(android.R.id.content);
                View dialogView = LayoutInflater.from(v.getContext()).inflate(R.layout.custom_dialog, viewGroup, false);
                textViewinfo_dialog =(AppCompatTextView) dialogView.findViewById(R.id.textViewinfo_dialog);
                Button btn_cancel = (Button) dialogView.findViewById(R.id.btn_cancel);
                Button btn_okay = (Button) dialogView.findViewById(R.id.btn_okay);
                builder.setView(dialogView);
                textViewinfo_dialog.setText(Html.fromHtml(getString(R.string.info_3)));
                AlertDialog alertDialog = builder.create();
                alertDialog.setCanceledOnTouchOutside(false);
                btn_cancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alertDialog.dismiss();
                    }
                });
                btn_okay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alertDialog.dismiss();
                    }
                });
                alertDialog.show();
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Information.this);
                ViewGroup viewGroup = findViewById(android.R.id.content);
                View dialogView = LayoutInflater.from(v.getContext()).inflate(R.layout.custom_dialog, viewGroup, false);
                textViewinfo_dialog =(AppCompatTextView) dialogView.findViewById(R.id.textViewinfo_dialog);
                Button btn_cancel = (Button) dialogView.findViewById(R.id.btn_cancel);
                Button btn_okay = (Button) dialogView.findViewById(R.id.btn_okay);
                builder.setView(dialogView);
                textViewinfo_dialog.setText(Html.fromHtml(getString(R.string.info_4)));
                AlertDialog alertDialog = builder.create();
                alertDialog.setCanceledOnTouchOutside(false);
                btn_cancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alertDialog.dismiss();
                    }
                });
                btn_okay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alertDialog.dismiss();
                    }
                });
                alertDialog.show();
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Information.this);
                ViewGroup viewGroup = findViewById(android.R.id.content);
                View dialogView = LayoutInflater.from(v.getContext()).inflate(R.layout.custom_dialog, viewGroup, false);
                textViewinfo_dialog =(AppCompatTextView) dialogView.findViewById(R.id.textViewinfo_dialog);
                Button btn_cancel = (Button) dialogView.findViewById(R.id.btn_cancel);
                Button btn_okay = (Button) dialogView.findViewById(R.id.btn_okay);
                builder.setView(dialogView);
                textViewinfo_dialog.setText(Html.fromHtml(getString(R.string.info_5)));
                AlertDialog alertDialog = builder.create();
                alertDialog.setCanceledOnTouchOutside(false);
                btn_cancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alertDialog.dismiss();
                    }
                });
                btn_okay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alertDialog.dismiss();
                    }
                });
                alertDialog.show();
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Information.this);
                ViewGroup viewGroup = findViewById(android.R.id.content);
                View dialogView = LayoutInflater.from(v.getContext()).inflate(R.layout.custom_dialog, viewGroup, false);
                textViewinfo_dialog =(AppCompatTextView) dialogView.findViewById(R.id.textViewinfo_dialog);
                Button btn_cancel = (Button) dialogView.findViewById(R.id.btn_cancel);
                Button btn_okay = (Button) dialogView.findViewById(R.id.btn_okay);
                builder.setView(dialogView);
                textViewinfo_dialog.setText(Html.fromHtml(getString(R.string.info_6)));
                AlertDialog alertDialog = builder.create();
                alertDialog.setCanceledOnTouchOutside(false);
                btn_cancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alertDialog.dismiss();
                    }
                });
                btn_okay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alertDialog.dismiss();
                    }
                });
                alertDialog.show();
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Information.this);
                ViewGroup viewGroup = findViewById(android.R.id.content);
                View dialogView = LayoutInflater.from(v.getContext()).inflate(R.layout.custom_dialog, viewGroup, false);
                textViewinfo_dialog =(AppCompatTextView) dialogView.findViewById(R.id.textViewinfo_dialog);
                Button btn_cancel = (Button) dialogView.findViewById(R.id.btn_cancel);
                Button btn_okay = (Button) dialogView.findViewById(R.id.btn_okay);
                builder.setView(dialogView);
                textViewinfo_dialog.setText(Html.fromHtml(getString(R.string.info_7)));
                AlertDialog alertDialog = builder.create();
                alertDialog.setCanceledOnTouchOutside(false);
                btn_cancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alertDialog.dismiss();
                    }
                });
                btn_okay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alertDialog.dismiss();
                    }
                });
                alertDialog.show();
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Information.this);
                ViewGroup viewGroup = findViewById(android.R.id.content);
                View dialogView = LayoutInflater.from(v.getContext()).inflate(R.layout.custom_dialog, viewGroup, false);
                textViewinfo_dialog =(AppCompatTextView) dialogView.findViewById(R.id.textViewinfo_dialog);
                Button btn_cancel = (Button) dialogView.findViewById(R.id.btn_cancel);
                Button btn_okay = (Button) dialogView.findViewById(R.id.btn_okay);
                builder.setView(dialogView);
                textViewinfo_dialog.setText(Html.fromHtml(getString(R.string.info_8)));
                AlertDialog alertDialog = builder.create();
                alertDialog.setCanceledOnTouchOutside(false);
                btn_cancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alertDialog.dismiss();
                    }
                });
                btn_okay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alertDialog.dismiss();
                    }
                });
                alertDialog.show();
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Information.this);
                ViewGroup viewGroup = findViewById(android.R.id.content);
                View dialogView = LayoutInflater.from(v.getContext()).inflate(R.layout.custom_dialog, viewGroup, false);
                textViewinfo_dialog =(AppCompatTextView) dialogView.findViewById(R.id.textViewinfo_dialog);
                Button btn_cancel = (Button) dialogView.findViewById(R.id.btn_cancel);
                Button btn_okay = (Button) dialogView.findViewById(R.id.btn_okay);
                builder.setView(dialogView);
                textViewinfo_dialog.setText(Html.fromHtml(getString(R.string.info_9)));
                AlertDialog alertDialog = builder.create();
                alertDialog.setCanceledOnTouchOutside(false);
                btn_cancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alertDialog.dismiss();
                    }
                });
                btn_okay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alertDialog.dismiss();
                    }
                });
                alertDialog.show();
            }
        });

    }
}