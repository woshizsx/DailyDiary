package sxkeji.net.dailydiary.utils;

import android.content.Context;
import android.text.TextUtils;

import com.google.gson.Gson;
import com.yuntu.carmaster.models.ProvinceCityBean;
import com.yuntu.carmaster.storage.ACache;

import java.util.List;

/**
 * Created by zhangshixin on 2015/11/18.
 */
public class ProvinceCityUtils {

    private String provinceId;
    private String cityId;
    private ProvinceCityBean provinceCityBean;
    private static Context mContext;

    public ProvinceCityUtils(Context context) {
        this.mContext = context;
    }

    public  void getProvinceAndCityId(String cityName) {
        if (cityName == null || TextUtils.isEmpty(cityName))
            return;
        if (provinceCityBean == null) {
            String areaJson = ACache.get(mContext).getAsString(Config.AREASDATA);
            if (!TextUtils.isEmpty(areaJson)) {
                provinceCityBean = (new Gson()).fromJson(areaJson, ProvinceCityBean.class);
            }
        }
        if(provinceCityBean == null)
            return;
        List<ProvinceCityBean.ResultEntity> result = provinceCityBean.getResult();
        if(result == null)
            return;

        for (int i = 0 ; i < result.size() ; i ++ ){
            List<ProvinceCityBean.ResultEntity.CitysEntity> citysEntities = result.get(i).getCitys();
            if(citysEntities == null)
                return;
            for ( int j = 0 ; j < citysEntities.size(); j ++){
                ProvinceCityBean.ResultEntity.CitysEntity citysEntity = citysEntities.get(j);
                if(citysEntity == null)
                    return;
                String citysEntityName = citysEntity.getName();

                if(citysEntityName.length() >= cityName.length()){
                    if(citysEntityName.contains(cityName)){
                        setPrivinceIdAndCityId(citysEntity);
                    }
                }else{
                    if(cityName.contains(citysEntityName)){
                        setPrivinceIdAndCityId(citysEntity);
                    }

                }
            }
        }
    }

    private void setPrivinceIdAndCityId(ProvinceCityBean.ResultEntity.CitysEntity citysEnti) {
        if(citysEnti != null){
            setPrivinceId(citysEnti.getProvinceId());
            setCityId(citysEnti.getId());
        }
    }

    public String getPrivinceId() {
        return provinceId;
    }

    public void setPrivinceId(String privinceId) {
        this.provinceId = privinceId;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }
}
