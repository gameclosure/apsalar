# Game Closure DevKit Plugin: Apsalar

This plugin adds install tracking support from the [Apsalar service](http://www.apsalar.com) for Android.

## Usage

Install the addon with `basil install apsalar`.

Include it in the `manifest.json` file under the "addons" section for your game:

~~~
"addons": [
	"apsalar"
],
~~~

Under the Android section, you can configure the plugin:

~~~
	"android": {
		"versionCode": 1,
		"apsalarKey": "gameclosure",
		"apsalarSecret": "BnXlpNjf",
		"apsalarFacebook": "123456789011223"
	},
~~~

Facebook is your Facebook App Id.  Secret and Key are provided on the SDK download page of the Apsalar website.

Note that the key names are case-sensitive.

You can test for successful integration on the [Apsalar website](http://www.apsalar.com).

