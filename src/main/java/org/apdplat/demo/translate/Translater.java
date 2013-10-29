package org.apdplat.demo.translate;

public interface Translater {

    /**
     * 翻译语言(自动识别源语言)
     *
     * @param text 翻译的内容
     * @param targetLang 目标语言
     * @return 目标语言内容
     */
    public String translate(final String text, final String targetLang);

    /**
     * 翻译语言(自动识别源语言)
     *
     * @param texts 翻译的内容数组
     * @param targetLang 目标语言
     * @return 目标语言内容
     */
    public String[] translate(final String[] texts, final String targetLang);

    /**
     * 翻译语言
     *
     * @param text 翻译的内容
     * @param srcLang 源语言
     * @param targetLang 目标语言
     * @return 目标语言内容
     */
    public String translate(final String text, final String srcLang, final String targetLang);

    /**
     * 翻译语言
     *
     * @param texts 翻译的内容数组
     * @param srcLang 源语言
     * @param targetLang 目标语言
     * @return 目标语言内容
     */
    public String[] translate(final String[] texts, final String srcLang, final String targetLang);
}