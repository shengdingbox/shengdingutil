package com.zhouzifei.tool.consts;

/**
 * 
 * @author 周子斐 (17600004572@163.com)
 * @version 1.0
 * @website https://www.zhouzifei.com
 * @date 2019年7月16日
 * @since 1.0
 */
public enum FileUploadType {
    COMMON("blog/"),
    QRCODE("blog/qrcode/"),
    SIMPLE("blog/article/"),
    COVER_IMAGE("blog/cover/");

    private String path;

    FileUploadType(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
