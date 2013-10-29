package org.apdplat.demo.translate;

public enum GoogleLanguage {

    AUTO_DETECT(""),
    AFRIKAANS("af"),
    ALBANIAN("sq"),
    AMHARIC("am"),
    ARABIC("ar"),
    ARMENIAN("hy"),
    AZERBAIJANI("az"),
    BASQUE("eu"),
    BELARUSIAN("be"),
    BENGALI("bn"),
    BIHARI("bh"),
    BULGARIAN("bg"),
    BURMESE("my"),
    CATALAN("ca"),
    CHEROKEE("chr"),
    CHINESE("zh"),
    CHINESE_SIMPLIFIED("zh-CN"),
    CHINESE_TRADITIONAL("zh-TW"),
    CROATIAN("hr"),
    CZECH("cs"),
    DANISH("da"),
    DHIVEHI("dv"),
    DUTCH("nl"),
    ENGLISH("en"),
    ESPERANTO("eo"),
    ESTONIAN("et"),
    FILIPINO("tl"),
    FINNISH("fi"),
    FRENCH("fr"),
    GALICIAN("gl"),
    GEORGIAN("ka"),
    GERMAN("de"),
    GREEK("el"),
    GUARANI("gn"),
    GUJARATI("gu"),
    HEBREW("iw"),
    HINDI("hi"),
    HUNGARIAN("hu"),
    ICELANDIC("is"),
    INDONESIAN("id"),
    INUKTITUT("iu"),
    IRISH("ga"),
    ITALIAN("it"),
    JAPANESE("ja"),
    KANNADA("kn"),
    KAZAKH("kk"),
    KHMER("km"),
    KOREAN("ko"),
    KURDISH("ku"),
    KYRGYZ("ky"),
    LAOTHIAN("lo"),
    LATVIAN("lv"),
    LITHUANIAN("lt"),
    MACEDONIAN("mk"),
    MALAY("ms"),
    MALAYALAM("ml"),
    MALTESE("mt"),
    MARATHI("mr"),
    MONGOLIAN("mn"),
    NEPALI("ne"),
    NORWEGIAN("no"),
    ORIYA("or"),
    PASHTO("ps"),
    PERSIAN("fa"),
    POLISH("pl"),
    PORTUGUESE("pt"),
    PUNJABI("pa"),
    ROMANIAN("ro"),
    RUSSIAN("ru"),
    SANSKRIT("sa"),
    SERBIAN("sr"),
    SINDHI("sd"),
    SINHALESE("si"),
    SLOVAK("sk"),
    SLOVENIAN("sl"),
    SPANISH("es"),
    SWAHILI("sw"),
    SWEDISH("sv"),
    TAJIK("tg"),
    TAMIL("ta"),
    TAGALOG("tl"),
    TELUGU("te"),
    THAI("th"),
    TIBETAN("bo"),
    TURKISH("tr"),
    UKRANIAN("uk"),
    URDU("ur"),
    UZBEK("uz"),
    UIGHUR("ug"),
    VIETNAMESE("vi"),
    WELSH("cy"),
    YIDDISH("yi");

    /**
     * 谷歌的当前语言的字符串表示形式。
     */
    private final String language;

    /**
     * 构造函数
     *
     * @param 语言标识符。
     */
    private GoogleLanguage(final String pLanguage) {
        language = pLanguage;
    }

    public static GoogleLanguage fromString(final String pLanguage) {
        for (GoogleLanguage lang : values()) {
            if (pLanguage.equals(lang.toString())) {
                return lang;
            }
        }
        return null;
    }

    /**
     * 返回的字符串表示这种语言。
     *
     * @return 这种语言的字符串表示形式。
     */
    @Override
    public String toString() {
        return language;
    }
}