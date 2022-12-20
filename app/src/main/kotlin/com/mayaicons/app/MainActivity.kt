package com.mayaicons.app

import com.github.javiersantos.piracychecker.BuildConfig
import com.github.javiersantos.piracychecker.PiracyChecker
//import dev.jahir.blueprint.app.R
import com.mayaicons.app.R
import dev.jahir.blueprint.ui.activities.BottomNavigationBlueprintActivity

class MainActivity : BottomNavigationBlueprintActivity() {

    /**
     * These things here have the default values. You can delete the ones you don't want to change
     * and/or modify the ones you want to.
     */
    override val billingEnabled = true

    override fun amazonInstallsEnabled(): Boolean = false
    override fun checkLPF(): Boolean = true
    override fun checkStores(): Boolean = true
    override val isDebug: Boolean = BuildConfig.DEBUG

    /**
     * This is your app's license key. Get yours on Google Play Dev Console.
     * Default one isn't valid and could cause issues in your app.
     */
    override fun getLicKey(): String? = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAkRRspuSE5B5MRwzJNF0pVPKpl6vh7a0QwZ1imKeqwFjRdvT0mgBWQG143zSFRZHariGqlreLekvPQstXePg3SAUSM2SXAhP+aGM732P8X70PkLcbeRwsXKkmMAFcQ93a0D0bbVB0/e64U6c3RXzrJev01LObn/mWmHEiHiLuOgjll2Hc9L6lCuEe6HcF4W54R+clWYEYLkeN3QtNRb9zBQc1NAxQFDOpCzQoXfSeF4gCk2iZDcL64u5UDVjak+LwIF4MY9mTLCahy5+bQcQ2ZPd6S0Erw49N0m1XTxTlwz9w5kvz5ZZ0YLA4xkXZbqRS9NqPb+VPlK9lTzeuFwZoYQIDAQAB"

    /**
     * This is the license checker code. Feel free to create your own implementation or
     * leave it as it is.
     * Anyways, keep the 'destroyChecker()' as the very first line of this code block
     * Return null to disable license check
     */
    override fun getLicenseChecker(): PiracyChecker? {
        destroyChecker() // Important
        return null // Just for CI purposes
        // return if (BuildConfig.DEBUG) null
        // else super.getLicenseChecker()
    }

    override fun defaultTheme(): Int = R.style.MyApp_Default
    override fun amoledTheme(): Int = R.style.MyApp_Default_Amoled

    override fun defaultMaterialYouTheme(): Int = R.style.MyApp_Default_MaterialYou
    override fun amoledMaterialYouTheme(): Int = R.style.MyApp_Default_Amoled_MaterialYou
}

