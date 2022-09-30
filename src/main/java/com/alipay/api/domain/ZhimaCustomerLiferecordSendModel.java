package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 合作商户回传用户的生活记录信息，推进用户生活记录任务
 *
 * @author auto create
 * @since 1.0, 2022-09-29 14:41:15
 */
public class ZhimaCustomerLiferecordSendModel extends AlipayObject {

	private static final long serialVersionUID = 3157325179721372797L;

	/**
	 * 业务时间，标准时间格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("biz_date")
	private Date bizDate;

	/**
	 * 证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 推进数据
	 */
	@ApiListField("data")
	@ApiField("push_d_t_o")
	private List<PushDTO> data;

	/**
	 * 芝麻内部配置的商户白名单,只有配置过的白名单才允许接入
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 场景
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public Date getBizDate() {
		return this.bizDate;
	}
	public void setBizDate(Date bizDate) {
		this.bizDate = bizDate;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public List<PushDTO> getData() {
		return this.data;
	}
	public void setData(List<PushDTO> data) {
		this.data = data;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
