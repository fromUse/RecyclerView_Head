package pushsummary.jzs.com.recyclerview_head;

import com.google.gson.Gson;

import java.util.List;

/**
 * Created by a on 2016/11/14.
 */
public class DataBean {

    /**
     * data : [{"sortString":"2","brandInfo":[{"id":"568","brand_code":"2nd_SWBD_FUN_WEAR","branD_NAME":"2nd_SWBD_FUN_WEAR","cname":"","ename":"2nd_SWBD_FUN_WEAR","first_letter":"2","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/Ft3HYzp8n3wnSZSmWrd6h2BJUmkY"}]},{"sortString":"A","brandInfo":[{"id":"27","brand_code":"TP35","branD_NAME":"ADIDAS ORIGINALS","cname":"阿迪达斯","ename":"ADIDAS ORIGINALS","first_letter":"A","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/Fuu8xOOUN8x2UoXJp0A4UR0MHg-x"},{"id":"40","brand_code":"adidas","branD_NAME":"adidas","cname":"阿迪达斯","ename":"adidas","first_letter":"A","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/FrFeeWkbHPC47JyTJqxFv0CbXyMC"},{"id":"42","brand_code":"adidas_neo","branD_NAME":"adidas neo","cname":"阿迪达斯","ename":"adidas neo","first_letter":"A","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/FvIJOIndbs4FcG9-d0wwmk4YwUpI"},{"id":"94","brand_code":"TP73","branD_NAME":"Angelia.Pets","cname":"","ename":"Angelia.Pets","first_letter":"A","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/FlRrqpbV56rRIDWMHHYqXZqOXrhX"},{"id":"125","brand_code":"Asics","branD_NAME":"Asics","cname":"亚瑟士","ename":"Asics","first_letter":"A","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/Fm8tBshAZh1vWbMng6MYGPWLrD5G"},{"id":"681","brand_code":"A_A_Spectrum","branD_NAME":"A.A.Spectrum","cname":"","ename":"A.A.Spectrum","first_letter":"A","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/FhU1c2-BVre6Iw4NU68-cHDGUwJQ"}]},{"sortString":"a","brandInfo":[{"id":"146","brand_code":"TP5","branD_NAME":"Across","cname":"","ename":"Across","first_letter":"a","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/FkWHWIv98sLiQqaViJU88X8ZVhi-"}]},{"sortString":"B","brandInfo":[{"id":"518","brand_code":"BRISTON","branD_NAME":"BRISTON","cname":"","ename":"BRISTON","first_letter":"B","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/FhAnDr9X8vNVm6CMsaChlJWVXvyU"},{"id":"46","brand_code":"Black_head","branD_NAME":"Black head","cname":"黑头","ename":"Black head","first_letter":"B","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/FgeSkQ_aqHln-VMdfn0IQ8Y2JFHt"},{"id":"441","brand_code":"BAIJUNJUE","branD_NAME":"百郡爵","cname":"百郡爵","ename":"BAIJUNJUE","first_letter":"B","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/Flgmc4xhFXPQDbrOnOXX3jvNoftu"}]},{"sortString":"C","brandInfo":[{"id":"48","brand_code":"cheap_monday","branD_NAME":"Cheap Monday","cname":"","ename":"Cheap Monday","first_letter":"C","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/Foc3rK3sb7_p2ZKEwM8atv6tQfXN"},{"id":"52","brand_code":"comback","branD_NAME":"comback","cname":"","ename":"comback","first_letter":"C","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/FrCC8yPYdfI661tfr3tN51ye6z9t"},{"id":"54","brand_code":"converse","branD_NAME":"converse","cname":"匡威","ename":"converse","first_letter":"C","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/FlAXQLLd00SHoAkn612Tlao031Oq"},{"id":"574","brand_code":"CHRIS_CHRISTY","branD_NAME":"CHRIS.CHRISTY","cname":"","ename":"CHRIS.CHRISTY","first_letter":"C","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/Fn9qIz1pyLEUNEvJrOQWK5efpnrb"},{"id":"580","brand_code":"connive","branD_NAME":"connive","cname":"","ename":"connive","first_letter":"C","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/FiM6zZDPw7C-fnK85BHA90IQdGdx"}]},{"sortString":"D","brandInfo":[{"id":"269","brand_code":"DNX","branD_NAME":"DNX","cname":"","ename":"DNX","first_letter":"D","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/FnTqAK3x1D8xUvPnxkNTUzgyRMOb"},{"id":"345","brand_code":"Dickies","branD_NAME":"Dickies","cname":"","ename":"Dickies","first_letter":"D","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/FmTjodSMJaxBSLsoz6f6DczVVIPc"},{"id":"103","brand_code":"dunklvolk","branD_NAME":"DUNKELVOLK","cname":"达克沃","ename":"DUNKELVOLK","first_letter":"D","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/Fl97oUaJj18XFGiUrUWpDF6gjHoT"},{"id":"138","brand_code":"TP1","branD_NAME":"Depot3","cname":"","ename":"DEPOT3","first_letter":"D","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/FlTH2GO1pzPg9tGHTC5KoByT8Rb5"},{"id":"425","brand_code":"DAPUDAPO","branD_NAME":"DAPU大朴","cname":"大朴","ename":"DAPU","first_letter":"D","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/FqQde6TsihNf0uzi9KjgIM2LWhGi"},{"id":"703","brand_code":"D_Ut_182","branD_NAME":"D&amp;Ut.182","cname":"","ename":"","first_letter":"D","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/FvDXmGLHsA8EP9h70wyMS8vTMuSA"}]},{"sortString":"E","brandInfo":[{"id":"602","brand_code":"EDWIN","branD_NAME":"EDWIN","cname":"","ename":"EDWIN","first_letter":"E","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/FrL61tytBkQmYxjBXaY3HzIDpkOq"}]},{"sortString":"F","brandInfo":[{"id":"575","brand_code":"FUHAOGONGSHE","branD_NAME":"符号公社","cname":"符号公社","ename":"","first_letter":"F","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/FjgqTYq2Ov3up_BXV1O0PcV9_oX6"},{"id":"577","brand_code":"FIYTA","branD_NAME":"FIYTA","cname":"飞亚达","ename":"FIYTA","first_letter":"F","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/FjbkDk2I4Xwt5qL5n-zdiIGY3f93"},{"id":"128","brand_code":"TP89","branD_NAME":"Fjallraven","cname":"北极狐","ename":"fjall raven","first_letter":"F","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/FoMAnTLfD4kTFjypgZZBJmoNBcC2"},{"id":"677","brand_code":"Flipbelt","branD_NAME":"Flipbelt","cname":"","ename":"Flipbelt","first_letter":"F","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/FjNouNyuxKBC6-WeTKIkV0-t4ND5"},{"id":"696","brand_code":"FEICHIZHONG","branD_NAME":"非池中","cname":"非池中","ename":"","first_letter":"F","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/Fqpf1pW_yTywrMbz3m7T1S0iLLyI"},{"id":"228","brand_code":"Filter017","branD_NAME":"Filter017","cname":"","ename":"Filter017","first_letter":"F","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/FtxDssSpAiyPDC-XEH2VnxRFGHBj"}]},{"sortString":"G","brandInfo":[{"id":"62","brand_code":"great_han","branD_NAME":"Great HAN","cname":"","ename":"Great HAN","first_letter":"G","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/FoC7rqQMQK73AXn5_5KealOkUIG3"},{"id":"442","brand_code":"GENANX","branD_NAME":"GENANX","cname":"闪电潮牌","ename":"GENANX","first_letter":"G","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/Fi0P0uHpo0vn5Oxqcu-Crh8Wri3K"},{"id":"704","brand_code":"GEMAX","branD_NAME":"GEMAX","cname":"","ename":"GEMAX","first_letter":"G","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/FueesRHR5FSZjle9aXFxYQGkaI26"}]},{"sortString":"H","brandInfo":[{"id":"630","brand_code":"HAMS","branD_NAME":"HAMS","cname":"","ename":"HAMS","first_letter":"H","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/FrkVdpxP8_gBNj1uVCd6ccMK_Amd"}]},{"sortString":"I","brandInfo":[{"id":"17","brand_code":"TP30","branD_NAME":"iienyear","cname":"十年","ename":"iienyear","first_letter":"I","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/Fs7qAiwV3RnmpSI7jeUpgfAspmsW"},{"id":"68","brand_code":"interfool","branD_NAME":"Interfool","cname":"","ename":"Interfool","first_letter":"I","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/FhvQl6G9AUrY02wlf1ZWkRfYsyta"},{"id":"692","brand_code":"ISLANDHAZE","branD_NAME":"ISLANDHAZE","cname":"","ename":"ISLANDHAZE","first_letter":"I","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/Fu8rgFw7BMqhNqfTmm9MjO-DA8vq"}]},{"sortString":"J","brandInfo":[{"id":"578","brand_code":"JONAS___VERUS","branD_NAME":"JONAS &amp; VERUS","cname":"唯路时","ename":"JONAS &amp; VERUS","first_letter":"J","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/FpDkfsAqg__ZnCtkX3behxBcLn6g"},{"id":"238","brand_code":"TP93","branD_NAME":"JanSport","cname":"简斯波特","ename":"JanSport","first_letter":"J","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/FneMyitse2lAboe9nR6jDSirSsSV"}]},{"sortString":"K","brandInfo":[{"id":"272","brand_code":"K_SWISS","branD_NAME":"K-SWISS","cname":"盖世威","ename":"K-SWISS","first_letter":"K","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/Fsu1_ZVaQY5mdAEHF1B6CuQMlgE9"},{"id":"591","brand_code":"KON","branD_NAME":"KON","cname":"","ename":"KON","first_letter":"K","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/FlQJft4U5KcF0OOE1agU-jMmR6xP"},{"id":"698","brand_code":"KACELSY","branD_NAME":"KACELSY","cname":"","ename":"KACELSY","first_letter":"K","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/FvNjibtSIfd4kd2Sx_3lAXIt674M"}]},{"sortString":"L","brandInfo":[{"id":"264","brand_code":"LEXON","branD_NAME":"LEXON","cname":"乐上","ename":"LEXON","first_letter":"L","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/FqA2X9GVat53AlcFOdgETCAlJWWc"},{"id":"594","brand_code":"LEVI_S","branD_NAME":"LEVI'S","cname":"李维斯","ename":"LEVI'S","first_letter":"L","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/FqzPc0276kIfcCbmADAX_qWyCI8y"},{"id":"113","brand_code":"line_artisanal","branD_NAME":"LINE ARTISANAL","cname":"匠线","ename":"LINE ARTISANAL","first_letter":"L","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/FrtrGnzsizi8PIvEIic_fQL3btOn"},{"id":"665","brand_code":"LEXIN","branD_NAME":"lifesense乐心","cname":"乐心","ename":"lifesense","first_letter":"L","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/Flk0k6uvT-UwHVuv148-zESv1-qm"},{"id":"695","brand_code":"LETS_TEE","branD_NAME":"LETS TEE","cname":"","ename":"LETS TEE","first_letter":"L","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/Fmi6Firdyp3GRE3gB4gC99AP3-cB"}]},{"sortString":"M","brandInfo":[{"id":"2","brand_code":"MC","branD_NAME":"ME＆CITY","cname":"","ename":"ME＆CITY","first_letter":"M","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/FhUJMs7CM_mxw_xneyNcJ26_Gaox"},{"id":"547","brand_code":"MIXSEVEN","branD_NAME":"MIXSEVEN","cname":"","ename":"MIXSEVEN","first_letter":"M","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/Fu7NckZhRiJpCeWmP1ByCRopO0Ha"},{"id":"71","brand_code":"TP61","branD_NAME":"墨匠","cname":"墨匠","ename":"Moessence","first_letter":"M","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/Fm69ai5ZvJ4-CV8t31UIinljRZXL"},{"id":"362","brand_code":"METRUST","branD_NAME":"METRUST","cname":"蜜丘琳","ename":"METRUST","first_letter":"M","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/FnTYyWVU29DQiilF7QM-BJ1-3yxj"},{"id":"449","brand_code":"MaxVis","branD_NAME":"MaxVis","cname":"满味","ename":"MaxVis","first_letter":"M","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/FhPJ-KAcbxt7FzSRxXxBh53a8wBc"},{"id":"208","brand_code":"M_R_K_T_","branD_NAME":"M.R.K.T.","cname":"马克兔","ename":"M.R.K.T.","first_letter":"M","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/Fnq2j2ktIPeZtxenKh0QUcPfian4"},{"id":"500","brand_code":"MLB_WATCH","branD_NAME":"MLB WATCH","cname":"美职棒MLB腕表","ename":"MLB WATCH","first_letter":"M","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/FunuHA760yEKtUiU_vO7SgFSyF1u"}]},{"sortString":"N","brandInfo":[{"id":"74","brand_code":"nike","branD_NAME":"nike","cname":"耐克","ename":"nike","first_letter":"N","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/FufkAU6C5ECq-MWvnv0TR83jRXJ9"}]},{"sortString":"O","brandInfo":[{"id":"127","brand_code":"Onitsuka_Tiger","branD_NAME":"Onitsuka Tiger","cname":"鬼冢虎","ename":"Onitsuka Tiger","first_letter":"O","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/FjjPsGFS_tUxOxFCcaoIw7v-HCKS"},{"id":"700","brand_code":"OMG","branD_NAME":"OMG","cname":"","ename":"","first_letter":"O","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/Fg3_YXA1o0jlmgByolOAgNJFAFyS"}]},{"sortString":"P","brandInfo":[{"id":"53","brand_code":"TP51","branD_NAME":"Passionarts","cname":"","ename":"Passionarts","first_letter":"P","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/Fqf9oy-iWSVOQ0YT2N2lFccq6-vU"},{"id":"75","brand_code":"pony","branD_NAME":"pony","cname":"波尼","ename":"pony","first_letter":"P","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/FtZHi8TRfLMf6BRculYka8RRyqlg"},{"id":"79","brand_code":"puma","branD_NAME":"puma","cname":"彪马","ename":"puma","first_letter":"P","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/FskqfoYVRMcIvCvoIZv8ec0hJkeS"},{"id":"701","brand_code":"Pioneer_CampTUOLUZHE","branD_NAME":"Pioneer Camp拓路者","cname":"拓路者","ename":"Pioneer Camp","first_letter":"P","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/FrXafuApkSDHbJdVKGQLrVh1UzKk"}]},{"sortString":"Q","brandInfo":[{"id":"671","brand_code":"QUIKSILVER","branD_NAME":"QUIKSILVER","cname":"","ename":"QUIKSILVER","first_letter":"Q","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/FgBrs_KqeZ48Wy9IbUKOblFl0t-C"}]},{"sortString":"R","brandInfo":[{"id":"545","brand_code":"Reshake","branD_NAME":"Reshake","cname":"马克华菲","ename":"Reshake","first_letter":"R","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/FjKpmS-9aYQGjcxlnPIqxKnKHkIS"},{"id":"81","brand_code":"reebok","branD_NAME":"REEBOK","cname":"锐步","ename":"REEBOK","first_letter":"R","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/Fl8qSrIYVhBLWFz6C4gpsQEv7kMv"},{"id":"134","brand_code":"TP95","branD_NAME":"RAWROW","cname":"","ename":"RAWROW","first_letter":"R","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/FrBIffnufpl6_rLa-_nbcsSlQ3aS"},{"id":"697","brand_code":"RJKK","branD_NAME":"RJKK","cname":"","ename":"RJKK","first_letter":"R","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/FsePz8M7iiDhqQwL4jltrK6uugnZ"}]},{"sortString":"S","brandInfo":[{"id":"553","brand_code":"SWBD_Sewing_Boundaries","branD_NAME":"SWBD Sewing Boundaries","cname":"","ename":"SWBD Sewing Boundaries","first_letter":"S","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/FmlN-RxM6JRreZAqqf5BEbsP5ib1"},{"id":"199","brand_code":"SWISSGEAR","branD_NAME":"SWISSGEAR","cname":"","ename":"SWISSGEAR","first_letter":"S","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/Ften2frGYHP7mSzOCeNUBuGePuV3"}]},{"sortString":"T","brandInfo":[{"id":"633","brand_code":"The_2nd_Law","branD_NAME":"The 2nd Law","cname":"","ename":"The 2nd Law","first_letter":"T","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/FhpHxfDG3RPACrWsHuZL-K9ODVwr"}]},{"sortString":"U","brandInfo":[{"id":"634","brand_code":"U_TOUCH","branD_NAME":"U-TOUCH","cname":"","ename":"U-TOUCH","first_letter":"U","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/FnTtzgcob4QGiXr37-XAGnp43CCw"},{"id":"396","brand_code":"UNNOWN","branD_NAME":"UNNOWN","cname":"伊路恩","ename":"UNNOWN","first_letter":"U","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/Fo375x0ZCrNwnQsjKqlbMsHfBhx1"}]},{"sortString":"V","brandInfo":[{"id":"154","brand_code":"TP9","branD_NAME":"VEIL","cname":"","ename":"VEIL","first_letter":"V","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/FkTh3KyC5KXAI3gmbjZ1W3e_MNPG"}]},{"sortString":"Y","brandInfo":[{"id":"596","brand_code":"YISHU","branD_NAME":"意树","cname":"","ename":"","first_letter":"Y","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/FnNOISPM_HYcQLi_j5QXplDCc6Nl"},{"id":"656","brand_code":"YBM","branD_NAME":"YBM","cname":"","ename":"YBM","first_letter":"Y","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/FnRhyjNHF4Y3aXBvBDSiKuYs-eXK"},{"id":"454","brand_code":"YASHENGLI","branD_NAME":"雅圣利","cname":"雅圣利","ename":"ASLEERY","first_letter":"Y","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/Fg9cSe5gRq_1itsUMF2BGoh3unLC"}]},{"sortString":"Z","brandInfo":[{"id":"529","brand_code":"ZIIIRO","branD_NAME":"ZIIIRO","cname":"","ename":"ZIIIRO","first_letter":"Z","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/FuF8Fqnu1L_KP7fy0P8VZ5CR8aOq"},{"id":"603","brand_code":"ZERONE","branD_NAME":"ZERONE","cname":"","ename":"ZERONE","first_letter":"Z","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/FkNKoWLlUtIlJBReaFfTZBcAgr3T"},{"id":"620","brand_code":"ZUONA","branD_NAME":"佐纳","cname":"佐纳","ename":"","first_letter":"Z","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/FtAaEZ6Wor1hY7KopcE65UtnA69M"}]}]
     * info :
     * status : 1
     */

    private String info;
    private int status;
    /**
     * sortString : 2
     * brandInfo : [{"id":"568","brand_code":"2nd_SWBD_FUN_WEAR","branD_NAME":"2nd_SWBD_FUN_WEAR","cname":"","ename":"2nd_SWBD_FUN_WEAR","first_letter":"2","logO_URL":"http://7xjir4.com2.z0.glb.qiniucdn.com/Ft3HYzp8n3wnSZSmWrd6h2BJUmkY"}]
     */

    private List<DataEntity> data;

    public static DataBean objectFromData(String str) {

        return new Gson().fromJson(str, DataBean.class);
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<DataEntity> getData() {
        return data;
    }

    public void setData(List<DataEntity> data) {
        this.data = data;
    }

    public static class DataEntity {
        private String sortString;
        /**
         * id : 568
         * brand_code : 2nd_SWBD_FUN_WEAR
         * branD_NAME : 2nd_SWBD_FUN_WEAR
         * cname :
         * ename : 2nd_SWBD_FUN_WEAR
         * first_letter : 2
         * logO_URL : http://7xjir4.com2.z0.glb.qiniucdn.com/Ft3HYzp8n3wnSZSmWrd6h2BJUmkY
         */

        private List<BrandInfoEntity> brandInfo;

        public static DataEntity objectFromData(String str) {

            return new Gson().fromJson(str, DataEntity.class);
        }

        public String getSortString() {
            return sortString;
        }

        public void setSortString(String sortString) {
            this.sortString = sortString;
        }

        public List<BrandInfoEntity> getBrandInfo() {
            return brandInfo;
        }

        public void setBrandInfo(List<BrandInfoEntity> brandInfo) {
            this.brandInfo = brandInfo;
        }

        public static class BrandInfoEntity {
            private String id;
            private String brand_code;
            private String branD_NAME;
            private String cname;
            private String ename;
            private String first_letter;
            private String logO_URL;

            public static BrandInfoEntity objectFromData(String str) {

                return new Gson().fromJson(str, BrandInfoEntity.class);
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getBrand_code() {
                return brand_code;
            }

            public void setBrand_code(String brand_code) {
                this.brand_code = brand_code;
            }

            public String getBranD_NAME() {
                return branD_NAME;
            }

            public void setBranD_NAME(String branD_NAME) {
                this.branD_NAME = branD_NAME;
            }

            public String getCname() {
                return cname;
            }

            public void setCname(String cname) {
                this.cname = cname;
            }

            public String getEname() {
                return ename;
            }

            public void setEname(String ename) {
                this.ename = ename;
            }

            public String getFirst_letter() {
                return first_letter;
            }

            public void setFirst_letter(String first_letter) {
                this.first_letter = first_letter;
            }

            public String getLogO_URL() {
                return logO_URL;
            }

            public void setLogO_URL(String logO_URL) {
                this.logO_URL = logO_URL;
            }
        }
    }
}
