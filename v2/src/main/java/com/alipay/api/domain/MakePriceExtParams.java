package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外部业务扩展参数
 *
 * @author auto create
 * @since 1.0, 2021-04-15 16:15:24
 */
public class MakePriceExtParams extends AlipayObject {

	private static final long serialVersionUID = 2643851266232496354L;

	/**
	 * 外部扩展特征,用于传入商家侧用户特征,如商家侧用户的会员等级,用户手机型号等
	 */
	@ApiField("ext_feature")
	private String extFeature;

	/**
	 * 外部扩展参数,用于商家侧定义传入一些系统控制参数,如此次请求是否可在定价区间外出价
	 */
	@ApiField("ext_info")
	private String extInfo;

	public String getExtFeature() {
		return this.extFeature;
	}
	public void setExtFeature(String extFeature) {
		this.extFeature = extFeature;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

}
