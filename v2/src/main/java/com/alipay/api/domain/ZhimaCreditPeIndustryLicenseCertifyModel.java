package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用服务产品证件校验结果认证
 *
 * @author auto create
 * @since 1.0, 2022-11-09 16:31:34
 */
public class ZhimaCreditPeIndustryLicenseCertifyModel extends AlipayObject {

	private static final long serialVersionUID = 2424152131442616327L;

	/**
	 * 业务场景,分时租赁平台:car_sharing_zhima,具体业务对应的业务场景请联系业务确认
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 扩展信息字段，格式:json，注意，如果字符串对应的json对象包含中文字符，需要对包含中文的字段进行编码
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 签约产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 证件校验状态 Y：校验通过， N:校验不通过
	 */
	@ApiField("status")
	private String status;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
