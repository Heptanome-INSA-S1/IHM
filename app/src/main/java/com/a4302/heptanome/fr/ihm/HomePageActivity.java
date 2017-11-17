package com.a4302.heptanome.fr.ihm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.LinearLayout;

/**
 * Created by lrouquette on 08/11/2017.
 */

public class HomePageActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
        setContentView(R.layout.home_page);

        createListenerBottomMenu(this);
        LinearLayout layout = (LinearLayout)findViewById(R.id.layout_for_cards);
        CustomCard card = new CustomCard(this,"Besoin info","Cherche info sur ?","Alex", CustomCard.CardType.INFOS);
        CustomCard card2 = new CustomCard(this,"Besoin d'un tournevis","Pour visser des vis","Clément", CustomCard.CardType.TOOLS);
        layout.addView(card);
        layout.addView(card2);
    }

    public static void createListenerBottomMenu(final AppCompatActivity activity){
        final LinearLayout ChooseProposeOrRequest =(LinearLayout)activity.findViewById(R.id.choose_propose_or_request);
        activity.findViewById(R.id.floatingActionButton).setOnClickListener(new View.OnClickListener() {
                                                                       @Override
                                                                       public void onClick(View view) {
                                                                           if(ChooseProposeOrRequest.getVisibility()==View.VISIBLE)
                                                                               ChooseProposeOrRequest.setVisibility(View.GONE);
                                                                           else
                                                                               ChooseProposeOrRequest.setVisibility(View.VISIBLE);
                                                                       }
                                                                   }
        );
        activity.findViewById(R.id.cancel_request_button).setOnClickListener(new View.OnClickListener() {
                                                                        @Override
                                                                        public void onClick(View view) {
                                                                            ChooseProposeOrRequest.setVisibility(View.GONE);
                                                                        }
                                                                    }
        );

        activity.findViewById(R.id.propose_request_button).setOnClickListener(new View.OnClickListener() {
                                                                         @Override
                                                                         public void onClick(View view) {
                                                                             Intent intent = new Intent(activity,ChooseService.class);
                                                                             intent.putExtra("request_or_propose","Propose");
                                                                             activity.startActivity(intent);
                                                                         }
                                                                     }
        );
        activity.findViewById(R.id.request_request_button).setOnClickListener(new View.OnClickListener() {
                                                                         @Override
                                                                         public void onClick(View view) {
                                                                             Intent intent = new Intent(activity,ChooseService.class);
                                                                             intent.putExtra("request_or_propose","Request");
                                                                             activity.startActivity(intent);
                                                                         }
                                                                     }
        );
        activity.findViewById(R.id.buttonNotification).setOnClickListener(new View.OnClickListener() {
                                                                     @Override
                                                                     public void onClick(View view) {
                                                                         Intent intent = new Intent(activity,NotifPageActivity.class);
                                                                         activity.startActivity(intent);
                                                                     }
                                                                 }
        );
        activity.findViewById(R.id.buttonProfil).setOnClickListener(new View.OnClickListener() {
                                                               @Override
                                                               public void onClick(View view) {
                                                                   Intent intent = new Intent(activity,ProfilActivity.class);
                                                                   activity.startActivity(intent);
                                                               }
                                                           }
        );

        activity.findViewById(R.id.buttonList).setOnClickListener(new View.OnClickListener() {
                                                             @Override
                                                             public void onClick(View view) {
                                                                 Intent intent = new Intent(activity,HomePageActivity.class);
                                                                 activity.startActivity(intent);
                                                             }
                                                         }
        );
        activity.findViewById(R.id.buttonCalendar).setOnClickListener(new View.OnClickListener() {
                                                                 @Override
                                                                 public void onClick(View view) {
                                                                     Intent intent = new Intent(activity,CalendarActivity.class);
                                                                     activity.startActivity(intent);
                                                                 }
                                                             }
        );
    }

}
