package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户的机构配置信息
 *
 * @author auto create
 * @since 1.0, 2022-11-09 17:57:46
 */
public class MerchantInstConfig extends AlipayObject {

	private static final long serialVersionUID = 4426988484866162715L;

	/**
	 * 机构短名称，既是合作机构的英文简称，用来标识该机构的唯一性；
	 */
	@ApiField("en_name")
	private String enName;

	/**
	 * 支付宝定义的业务类型，JF表示公共事业缴费，HK表示信用卡还款具体见附录描述
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 业务场景；分为销帐(chargeoff)和输出(EXTERNAL)
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 合作机构中文名称，如HZCB，中文名称：杭州银行
	 */
	@ApiField("zh_name")
	private String zhName;

	public String getEnName() {
		return this.enName;
	}
	public void setEnName(String enName) {
		this.enName = enName;
	}

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getZhName() {
		return this.zhName;
	}
	public void setZhName(String zhName) {
		this.zhName = zhName;
	}

}
