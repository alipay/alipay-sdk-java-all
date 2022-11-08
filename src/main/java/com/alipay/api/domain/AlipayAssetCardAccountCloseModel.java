package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 注销网商账户接口
 *
 * @author auto create
 * @since 1.0, 2022-10-12 19:37:10
 */
public class AlipayAssetCardAccountCloseModel extends AlipayObject {

	private static final long serialVersionUID = 4692852882426482858L;

	/**
	 * 资产id
	 */
	@ApiField("asset_id")
	private String assetId;

	/**
	 * 业务时间
	 */
	@ApiField("biz_dt")
	private Date bizDt;

	/**
	 * 业务单号，幂等用
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 扩展信息，json格式
	 */
	@ApiField("extend_info")
	private String extendInfo;

	/**
	 * 卡产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 支付宝卡模板id
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getAssetId() {
		return this.assetId;
	}
	public void setAssetId(String assetId) {
		this.assetId = assetId;
	}

	public Date getBizDt() {
		return this.bizDt;
	}
	public void setBizDt(Date bizDt) {
		this.bizDt = bizDt;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getExtendInfo() {
		return this.extendInfo;
	}
	public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
