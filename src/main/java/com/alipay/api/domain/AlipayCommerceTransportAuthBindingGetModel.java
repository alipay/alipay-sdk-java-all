package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询授权状态
 *
 * @author auto create
 * @since 1.0, 2021-12-28 16:35:13
 */
public class AlipayCommerceTransportAuthBindingGetModel extends AlipayObject {

	private static final long serialVersionUID = 1473828748152293964L;

	/**
	 * 证件号。证件类型对应的号码。当传入证件类型时，必须填本字段。
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型。取值枚举需要找开发人员咨询。例如IDENTITY_CARD表示身份证
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 外部业务号，唯一标志本次请求
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 授权场景，标志具体是哪种授权数据。具体取值需要找开发人员分配。例如机票行程授权场景取值为FLIGHT_TRIP_AUTH
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 蚂蚁统一会员ID。当没有传证件类型时，必须传本字段。
	 */
	@ApiField("user_id")
	private String userId;

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
