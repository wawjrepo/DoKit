package com.didichuxing.doraemonkit.kit.parameter.ram;

import android.app.Activity;
import android.content.Context;

import androidx.annotation.NonNull;

import com.didichuxing.doraemonkit.R;
import com.didichuxing.doraemonkit.kit.AbstractKit;
import com.didichuxing.doraemonkit.util.ToastUtils;
import com.google.auto.service.AutoService;

/**
 * ================================================
 * 作    者：jint（金台）
 * 版    本：1.0
 * 创建日期：2019-09-24-17:05
 * 描    述：内存泄漏leakCanary功能入口
 * 修订历史：
 * ================================================
 */
@AutoService(AbstractKit.class)
public class LeakCanaryKit extends AbstractKit {

    @Override
    public int getName() {
        return R.string.dk_frameinfo_leakcanary;
    }

    @Override
    public int getIcon() {
        return R.mipmap.dk_leak_canary_icon;
    }


    @Override
    public boolean onClickWithReturn(@NonNull Activity activity) {
        ToastUtils.showLong("在构建配置文件中开启LeakCanary后，打包即可");
        return false;
    }

    @Override
    public void onAppInit(Context context) {

    }

    @Override
    public boolean isInnerKit() {
        return true;
    }

    @Override
    public String innerKitId() {
        return "dokit_sdk_performance_ck_leak";
    }
}
