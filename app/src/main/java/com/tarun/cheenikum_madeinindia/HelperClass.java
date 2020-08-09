package com.tarun.cheenikum_madeinindia;


import android.widget.ImageView;
import android.widget.TextView;

class HelperClass {
    private ImageView flagStatus;
    private TextView nameCountry;
    private int barCode;


   /* HashMap<Integer,Integer> mapFlag = new HashMap<>();
    HashMap<Integer,String> mapName = new HashMap<>();*/


    HelperClass(ImageView flag, TextView name, int code) {
        flagStatus = flag;
        nameCountry = name;
        barCode = code;
    }

    void updateUi() {

        /*mapFlag.put(890,R.drawable.flag_india);
        mapFlag.put(697,R.drawable.flag_china);
        mapName.put(890,"INDIA");
        mapName.put(697,"CHINA");

        flagStatus.setImageResource(hashMap.get(barCode));
        nameCountry.setText(hashMapp.get(barCode));*/


        if((barCode >= 0)  &&  (barCode <= 19) ){
            flagStatus.setImageResource(R.drawable.flag_united_states);
            nameCountry.setText("USA");
        }
        else if((barCode >= 30)  && (barCode <= 39)){
            flagStatus.setImageResource(R.drawable.flag_united_states);
            nameCountry.setText("USA");
        }
        else if((barCode >= 60)  && (barCode <= 99)){
            flagStatus.setImageResource(R.drawable.flag_united_states);
            nameCountry.setText("USA");
        }
        else if((barCode >= 100)  && (barCode <= 139)){
            flagStatus.setImageResource(R.drawable.flag_united_states);
            nameCountry.setText("USA");
        }
        else if((barCode >= 300)  && (barCode <= 379)){
            flagStatus.setImageResource(R.drawable.flag_france);
            nameCountry.setText("FRANCE");
        }
        else if(barCode == 380 ){
            flagStatus.setImageResource(R.drawable.flag_bulgaria);
            nameCountry.setText("BULGARIA");
        }
        else if(barCode == 383){
            flagStatus.setImageResource(R.drawable.flag_slovenie);
            nameCountry.setText("SLOVENIA");
        }
        else if(barCode == 385){
            flagStatus.setImageResource(R.drawable.flag_croatia);
            nameCountry.setText("CROATIA");
        }
        else if(barCode ==
                387){
            flagStatus.setImageResource(R.drawable.flag_bosnia);
            nameCountry.setText("BOSNIA");
        }
        else if(barCode == 389){
            flagStatus.setImageResource(R.drawable.flag_montenegro);
            nameCountry.setText("MONTENEGRO");
        }
        else if(barCode == 390){
            flagStatus.setImageResource(0);
            nameCountry.setText("KOSOVO");
        }
        else if((barCode >= 400)  && (barCode <= 440)){
            flagStatus.setImageResource(R.drawable.flag_germany);
            nameCountry.setText("GERMANY");
        }
        else if((barCode >= 450)  && (barCode <= 459)){
            flagStatus.setImageResource(R.drawable.flag_japan);
            nameCountry.setText("JAPAN");
        }
        else if((barCode >= 460)  && (barCode <= 469)){
            flagStatus.setImageResource(R.drawable.flag_russia);
            nameCountry.setText("RUSSIA");
        }
        else if(barCode == 470){
            flagStatus.setImageResource(R.drawable.flag_kyrgyzstan);
            nameCountry.setText("KYRGYZSTAN");
        }
        else if(barCode == 471){
            flagStatus.setImageResource(R.drawable.flag_taiwan);
            nameCountry.setText("TAIWAN");
        }
        else if(barCode == 474){
            flagStatus.setImageResource(R.drawable.flag_estonia);
            nameCountry.setText("ESTONIA");
        }
        else if(barCode == 475){
            flagStatus.setImageResource(R.drawable.flag_latvia);
            nameCountry.setText("LATVIA");
        }
        else if(barCode == 476){
            flagStatus.setImageResource(R.drawable.flag_azerbaijan);
            nameCountry.setText("AZERBAIJAN");
        }
        else if(barCode == 477){
            flagStatus.setImageResource(R.drawable.flag_lithuania);
            nameCountry.setText("LITHUANIA");
        }
        else if(barCode == 478) {
            flagStatus.setImageResource(R.drawable.flag_uzbekistan);
            nameCountry.setText("UZBEKISTAN");
        }
                else if(barCode == 479){
                flagStatus.setImageResource(R.drawable.flag_sri_lanka);
                nameCountry.setText("SRI LANKA");
            }
        else if(barCode == 480){
            flagStatus.setImageResource(R.drawable.flag_philippines);
            nameCountry.setText("PHILIPPINES");
        }
        else if(barCode == 481){
            flagStatus.setImageResource(R.drawable.flag_belarus);
            nameCountry.setText("BELARUS");
        }
        else if(barCode == 482){
            flagStatus.setImageResource(R.drawable.flag_ukraine);
            nameCountry.setText("UKRAINE");
        }
        else if(barCode == 483){
            flagStatus.setImageResource(R.drawable.flag_turkmenistan);
            nameCountry.setText("TURKMENISTAN");
        }
        else if(barCode == 484){
            flagStatus.setImageResource(R.drawable.flag_moldova);
            nameCountry.setText("MOLDOVA");
        }
        else if(barCode == 485){
            flagStatus.setImageResource(R.drawable.flag_armenia);
            nameCountry.setText("ARMENIA");
        }
        else if(barCode == 486){
            flagStatus.setImageResource(R.drawable.flag_georgia);
            nameCountry.setText("GEORGIA");
        }
        else if(barCode == 487){
            flagStatus.setImageResource(R.drawable.flag_kazakhstan);
            nameCountry.setText("KAZAKHSTAN");
        }
        else if(barCode == 488){
            flagStatus.setImageResource(R.drawable.flag_tajikistan);
            nameCountry.setText("TAJIKISTAN");
        }
        else if(barCode == 489){
            flagStatus.setImageResource(R.drawable.flag_hong_kong);
            nameCountry.setText("HONG KONG");
        }
        else if((barCode >= 490)  && (barCode <= 499)){
            flagStatus.setImageResource(R.drawable.flag_japan);
            nameCountry.setText("JAPAN");
        }
        else if((barCode >= 500)  && (barCode <= 509)){
            flagStatus.setImageResource(R.drawable.flag_uk);
            nameCountry.setText("UK");
        }
        else if((barCode >= 520)  && (barCode <= 521)){
            flagStatus.setImageResource(R.drawable.flag_greece);
            nameCountry.setText("GREECE");
        }
        else if(barCode == 528){
            flagStatus.setImageResource(R.drawable.flag_lebanon);
            nameCountry.setText("LEBANON");
        }
        else if(barCode == 529){
            flagStatus.setImageResource(R.drawable.flag_cyprus);
            nameCountry.setText("CYPRUS");
        }
        else if(barCode == 530){
            flagStatus.setImageResource(R.drawable.flag_albania);
            nameCountry.setText("ALBANIA");
        }
        else if(barCode == 531){
            flagStatus.setImageResource(0);
            nameCountry.setText("NORTH MACEDONIA");
        }
        else if(barCode == 535){
            flagStatus.setImageResource(R.drawable.flag_malta);
            nameCountry.setText("MALTA");
        }
        else if(barCode == 539){
            flagStatus.setImageResource(R.drawable.flag_republic_of_ireland);
            nameCountry.setText("IRELAND");
        }
        else if((barCode >= 540)  && (barCode <= 549)){
            flagStatus.setImageResource(R.drawable.flag_belgium_luxembourg);
            nameCountry.setText("BELGIUM");
        }
        else if(barCode == 560){
            flagStatus.setImageResource(R.drawable.flag_portugal);
            nameCountry.setText("PORTUGAL");
        }
        else if(barCode == 569){
            flagStatus.setImageResource(R.drawable.flag_iceland);
            nameCountry.setText("ICELAND");
        }
        else if((barCode >= 570)  && (barCode <= 579)){
            flagStatus.setImageResource(R.drawable.flag_denmark);
            nameCountry.setText("DENMARK");
        }
        else if(barCode == 590){
            flagStatus.setImageResource(R.drawable.flag_poland);
            nameCountry.setText("POLAND");
        }
        else if(barCode == 594){
            flagStatus.setImageResource(R.drawable.flag_romania);
            nameCountry.setText("ROMANIA");
        }
        else if((barCode >= 600)  && (barCode <= 601)){
            flagStatus.setImageResource(R.drawable.flag_south_africa);
            nameCountry.setText("SOUTH AFRICA");
        }
        else if(barCode == 603){
            flagStatus.setImageResource(R.drawable.flag_ghana);
            nameCountry.setText("GHANA");
        }
        else if(barCode == 604) {
            flagStatus.setImageResource(R.drawable.flag_senegal);
            nameCountry.setText("SENEGAL");
        }
        else if(barCode == 608) {
            flagStatus.setImageResource(R.drawable.flag_bahrain);
            nameCountry.setText("BAHRAIN");
        }
        else if(barCode == 609) {
            flagStatus.setImageResource(R.drawable.flag_mauritius);
            nameCountry.setText("MAURITIUS");
        }
        else if(barCode == 611) {
            flagStatus.setImageResource(R.drawable.flag_morocco);
            nameCountry.setText("MOROCCO");
        }
        else if(barCode == 613) {
            flagStatus.setImageResource(R.drawable.flag_algeria);
            nameCountry.setText("ALGERIA");
        }
        else if(barCode == 615) {
            flagStatus.setImageResource(R.drawable.flag_nigeria);
            nameCountry.setText("NIGERIA");
        }
        else if(barCode == 616) {
            flagStatus.setImageResource(R.drawable.flag_kenya);
            nameCountry.setText("KENYA");
        }
        else if(barCode == 617) {
            flagStatus.setImageResource(0);
            nameCountry.setText("CAMEROON");
        }
        else if(barCode == 618) {
            flagStatus.setImageResource(R.drawable.flag_ivory_coast);
            nameCountry.setText("IVORY COAST");
        }
        else if(barCode == 619) {
            flagStatus.setImageResource(R.drawable.flag_tunisia);
            nameCountry.setText("TUNISIA");
        }
        else if(barCode == 620) {
            flagStatus.setImageResource(R.drawable.flag_tanzania);
            nameCountry.setText("TANZANIA");
        }
        else if(barCode == 621) {
            flagStatus.setImageResource(R.drawable.flag_syria);
            nameCountry.setText("SYRIA");
        }
        else if(barCode == 622) {
            flagStatus.setImageResource(R.drawable.flag_egypt);
            nameCountry.setText("EGYPT");
        }
        else if(barCode == 623) {
            flagStatus.setImageResource(R.drawable.flag_brunei);
            nameCountry.setText("BRUNEI");
        }
        else if(barCode == 624) {
            flagStatus.setImageResource(R.drawable.flag_libya);
            nameCountry.setText("LIBYA");
        }
        else if(barCode == 625) {
            flagStatus.setImageResource(R.drawable.flag_jordan);
            nameCountry.setText("JORDAN");
        }
        else if(barCode == 626) {
            flagStatus.setImageResource(R.drawable.flag_iran);
            nameCountry.setText("IRAN");
        }
        else if(barCode == 627) {
            flagStatus.setImageResource(R.drawable.flag_kuwait);
            nameCountry.setText("KUWAIT");
        }
        else if(barCode == 628) {
            flagStatus.setImageResource(R.drawable.flag_saudi_arabia);
            nameCountry.setText("SAUDI ARABIA");
        }
        else if(barCode == 629) {
            flagStatus.setImageResource(R.drawable.flag_united_arab_emirates);
            nameCountry.setText("UAE");
        }
        else if(barCode == 630) {
            flagStatus.setImageResource(0);
            nameCountry.setText("QATAR");
        }
        else if((barCode >= 640) && (barCode <=649)){
            flagStatus.setImageResource(R.drawable.flag_finland);
            nameCountry.setText("FINLAND");
        }
        else if((barCode >= 690) &&(barCode <=699)){
            flagStatus.setImageResource(R.drawable.flag_china);
            nameCountry.setText("CHINA");
        }
        else if((barCode >= 700) &&( barCode <=709) ){
            flagStatus.setImageResource(R.drawable.flag_norway);
            nameCountry.setText("NORWAY");
        }
        else if(barCode == 729) {
            flagStatus.setImageResource(R.drawable.flag_israel);
            nameCountry.setText("ISRAEL");
        }
        else if((barCode >=730 ) && (barCode <= 739)){
            flagStatus.setImageResource(R.drawable.flag_sweden);
            nameCountry.setText("SWEDEN");
        }
        else if(barCode == 740) {
            flagStatus.setImageResource(R.drawable.flag_guatemala);
            nameCountry.setText("GUATEMALA");
        }
        else if(barCode == 741) {
            flagStatus.setImageResource(0);
            nameCountry.setText("EL SALVADOR");
        }
        else if(barCode == 742) {
            flagStatus.setImageResource(R.drawable.flag_honduras);
            nameCountry.setText("HONDURAS");
        }
        else if(barCode == 743) {
            flagStatus.setImageResource(R.drawable.flag_nicaragua);
            nameCountry.setText("NICARAGUA");
        }
        else if(barCode == 744) {
            flagStatus.setImageResource(R.drawable.flag_costa_rica);
            nameCountry.setText("COSTA RICA");
        }
        else if(barCode == 745) {
            flagStatus.setImageResource(R.drawable.flag_panama);
            nameCountry.setText("PANAMA");
        }
        else if(barCode == 746) {
            flagStatus.setImageResource(R.drawable.flag_dominican_republic);
            nameCountry.setText("DOMINICAN PUBLIC");
        }
        else if(barCode == 750) {
            flagStatus.setImageResource(R.drawable.flag_mexico);
            nameCountry.setText("MEXICO");
        }
        else if((barCode >=754) && (barCode <= 755)){
            flagStatus.setImageResource(R.drawable.flag_canada);
            nameCountry.setText("CANADA");
        }
        else if(barCode == 759) {
            flagStatus.setImageResource(R.drawable.flag_venezuela);
            nameCountry.setText("VENEZUELA");
        }
        else if((barCode >= 760) && (barCode <=769)){
            flagStatus.setImageResource(R.drawable.flag_switzerland);
            nameCountry.setText("SWITZERLAND");
        }
           else if((barCode >= 770) && (barCode <=771)) {
            flagStatus.setImageResource(R.drawable.flag_colombia);
            nameCountry.setText("COLOMBIA");
        }
           else if(barCode == 773) {
            flagStatus.setImageResource(R.drawable.flag_uruguay);
            nameCountry.setText("URUGUAY");
        }
        else if(barCode == 775) {
            flagStatus.setImageResource(R.drawable.flag_peru);
            nameCountry.setText("PERU");
        }
        else if(barCode == 777) {
            flagStatus.setImageResource(R.drawable.flag_bolivia);
            nameCountry.setText("BOLIVIA");
        }
        else if((barCode >= 778) && (barCode <= 779 )) {
            flagStatus.setImageResource(R.drawable.flag_argentina);
            nameCountry.setText("ARGENTINA");
        }
        else if(barCode == 780) {
            flagStatus.setImageResource(R.drawable.flag_chile);
            nameCountry.setText("CHILE");
        }
        else if(barCode == 784) {
            flagStatus.setImageResource(R.drawable.flag_paraguay);
            nameCountry.setText("PARAGUAY");
        }
        else if(barCode == 786) {
            flagStatus.setImageResource(R.drawable.flag_ecuador);
            nameCountry.setText("ECUADOR");
        }
        else if((barCode >= 789) && (barCode <=790)){
            flagStatus.setImageResource(R.drawable.flag_brazil);
            nameCountry.setText("BRAZIL");
        }
        else if((barCode >= 800) && (barCode <=839)){
            flagStatus.setImageResource(R.drawable.flag_italy);
            nameCountry.setText("ITALY");
        }
        else if((barCode >= 840) && (barCode <= 849)) {
            flagStatus.setImageResource(R.drawable.flag_spain);
            nameCountry.setText("SPAIN");
        }
        else if(barCode == 850) {
            flagStatus.setImageResource(R.drawable.flag_cuba);
            nameCountry.setText("CUBA");
        }
        else if(barCode == 858) {
            flagStatus.setImageResource(R.drawable.flag_slovakia);
            nameCountry.setText("SLOVAKIA");
        }
        else if(barCode == 859) {
            flagStatus.setImageResource(R.drawable.flag_czech_republic);
            nameCountry.setText("CZECH REPUBLIC");
        }
        else if(barCode == 860) {
            flagStatus.setImageResource(R.drawable.flag_serbia);
            nameCountry.setText("SERBIA");
        }
        else if(barCode == 865) {
            flagStatus.setImageResource(R.drawable.flag_mongolia);
            nameCountry.setText("MONGOLIA");
        }
        else if(barCode == 867) {
            flagStatus.setImageResource(R.drawable.flag_north_korea);
            nameCountry.setText("NORTH KOREA");
        }
        else if((barCode >= 868) && (barCode <= 869)){
            flagStatus.setImageResource(R.drawable.flag_turkey);
            nameCountry.setText("TURKEY");
        }
           else if((barCode >= 870 ) && (barCode <=879)) {
            flagStatus.setImageResource(R.drawable.flag_netherlands);
            nameCountry.setText("NETHERLANDS");
        }
        else if(barCode == 880) {
            flagStatus.setImageResource(R.drawable.flag_south_korea);
            nameCountry.setText("SOUTH KOREA");
        }
        else if(barCode == 883) {
            flagStatus.setImageResource(0);
            nameCountry.setText("MYANMAR");
        }
        else if(barCode == 884) {
            flagStatus.setImageResource(R.drawable.flag_cambodia);
            nameCountry.setText("CAMBODIA");
        }
        else if(barCode == 885) {
            flagStatus.setImageResource(R.drawable.flag_thailand);
            nameCountry.setText("THAILAND");
        }
        else if(barCode == 888) {
            flagStatus.setImageResource(R.drawable.flag_singapore);
            nameCountry.setText("SINGAPORE");
        }
        else if(barCode == 890) {
            flagStatus.setImageResource(R.drawable.flag_india);
            nameCountry.setText("INDIA");
        }
        else if(barCode == 893) {
            flagStatus.setImageResource(R.drawable.flag_vietnam);
            nameCountry.setText("VIETNAM");
        }
        else if(barCode == 896) {
            flagStatus.setImageResource(R.drawable.flag_pakistan);
            nameCountry.setText("PAKISTAN");
        }
        else if(barCode == 899) {
            flagStatus.setImageResource(R.drawable.flag_indonesia);
            nameCountry.setText("INDONESIA");
        }
        else if((barCode >= 900 ) && (barCode <=919)){
            flagStatus.setImageResource(R.drawable.flag_austria);
            nameCountry.setText("AUSTRIA");
        }
        else if((barCode >= 930) && (barCode <= 939)){
            flagStatus.setImageResource(R.drawable.flag_australia);
            nameCountry.setText("AUSTRALIA");
        }
        else if((barCode >= 940) && ( barCode <=949)){
            flagStatus.setImageResource(R.drawable.flag_new_zealand);
            nameCountry.setText("NEW ZEALAND");
        }
           else if(barCode == 955) {
            flagStatus.setImageResource(R.drawable.flag_malaysia);
            nameCountry.setText("MALAYSIA");
        }
        else if(barCode == 958) {
            flagStatus.setImageResource(R.drawable.flag_macau);
            nameCountry.setText("MACAU");
        }
        else if((barCode >= 978) && (barCode <=979)) {
            flagStatus.setImageResource(0);
            nameCountry.setText("BOOKLAND");
        }
        else {
            flagStatus.setImageResource(R.drawable.flag_default);
            nameCountry.setText("NOT FOUND");
        }
    }

}
