package com.tealeaf.plugin.plugins;

import com.tealeaf.logger;
import com.tealeaf.plugin.IPlugin;
import java.io.*;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.apsalar.sdk.Apsalar;

import android.app.Activity;
import android.content.Intent;
import android.content.Context;
import android.util.Log;
import android.os.Bundle;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;

public class ApsalarPlugin implements IPlugin {

	private Activity mActivity;
	private Context mContext;

	public ApsalarPlugin() {
	}

	public void onCreateApplication(Context applicationContext) {
		mContext = applicationContext;
	}

	public void onCreate(Activity activity, Bundle savedInstanceState) {
		this.mActivity = activity;

		PackageManager manager = activity.getPackageManager();
		String key = "";
		String secret = "";
		String facebook = "";
		try {
			Bundle meta = manager.getApplicationInfo(activity.getPackageName(), PackageManager.GET_META_DATA).metaData;
			if (meta != null) {
				key = meta.get("APSALAR_KEY").toString();
				secret = meta.get("APSALAR_SECRET").toString();
				facebook = meta.get("APSALAR_FACEBOOK").toString();
			}
		} catch (Exception e) {
			android.util.Log.d("EXCEPTION", "" + e.getMessage());
		}

		logger.log("{apsalar} Initializing from manifest with key=", key, "secret=", secret, "facebook=", facebook);

		Apsalar.startSession(activity, key, secret);
		Apsalar.setFBAppId(facebook);
	}

	public void onResume() {
	}

	public void onStart() {
	}

	public void onPause() {
	}

	public void onStop() {
	}

	public void onDestroy() {
	}

	public void onNewIntent(Intent intent) {
	}

	public void setInstallReferrer(String referrer) {
	}

	public void onActivityResult(Integer request, Integer result, Intent data) {
	}

	public boolean consumeOnBackPressed() {
		return true;
	}

	public void onBackPressed() {
	}
}
