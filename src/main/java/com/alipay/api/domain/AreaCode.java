package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 区域代码
 *
 * @author auto create
 * @since 1.0, 2017-04-06 18:05:03
 */
public class AreaCode extends AlipayObject {

	private static final long serialVersionUID = 7116418279171245577L;

	/**
	 * 区域类型
AREA_PRVN:省代码；
AREA_CITY:市代码；
AREA_DIST:区县代码；
	 */
	@ApiField("area_type")
	private String areaType;

	/**
	 * 区域代码
省市区代码，国标码，详见国家统计局数据，<a href="http://aopsdkdownload.cn-hangzhou.alipay-pub.aliyun-inc.com/doc/2016.xls?spm=a219a.7395905.0.0.IwSSLe&file=2016.xls">点此下载</a>。
	 */
	@ApiField("code")
	private String code;

	public String getAreaType() {
		return this.areaType;
	}
	public void setAreaType(String areaType) {
		this.areaType = areaType;
	}

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

}
