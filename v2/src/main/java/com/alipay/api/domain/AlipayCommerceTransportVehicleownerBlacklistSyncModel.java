package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车主服务黑名单同步接口
 *
 * @author auto create
 * @since 1.0, 2023-08-28 16:37:33
 */
public class AlipayCommerceTransportVehicleownerBlacklistSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2787979957972366179L;

	/**
	 * 支付宝生成的签约协议编号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * ETC车牌颜色代码。0:蓝色, 1:黄色, 2:黑色, 3:白色, 4:渐变绿色
	 */
	@ApiField("plate_color")
	private String plateColor;

	/**
	 * 车牌号码
	 */
	@ApiField("plate_no")
	private String plateNo;

	/**
	 * 黑名单来源渠道标识。具体传值由支付宝和调用方在接入前分配。
	 */
	@ApiField("source")
	private String source;

	/**
	 * 黑名单操作类型。IN:入黑名单，OUT:出黑名单
	 */
	@ApiField("status_opt")
	private String statusOpt;

	/**
	 * 黑名单状态操作时间
	 */
	@ApiField("status_opt_time")
	private Date statusOptTime;

	/**
	 * 入黑/出黑原因
	 */
	@ApiField("status_reason")
	private String statusReason;

	/**
	 * 入黑/出黑原因代码。操作为入黑时，该字段必须；操作为出黑时，该字段不传值。
	 */
	@ApiField("status_reason_code")
	private String statusReasonCode;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getPlateColor() {
		return this.plateColor;
	}
	public void setPlateColor(String plateColor) {
		this.plateColor = plateColor;
	}

	public String getPlateNo() {
		return this.plateNo;
	}
	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getStatusOpt() {
		return this.statusOpt;
	}
	public void setStatusOpt(String statusOpt) {
		this.statusOpt = statusOpt;
	}

	public Date getStatusOptTime() {
		return this.statusOptTime;
	}
	public void setStatusOptTime(Date statusOptTime) {
		this.statusOptTime = statusOptTime;
	}

	public String getStatusReason() {
		return this.statusReason;
	}
	public void setStatusReason(String statusReason) {
		this.statusReason = statusReason;
	}

	public String getStatusReasonCode() {
		return this.statusReasonCode;
	}
	public void setStatusReasonCode(String statusReasonCode) {
		this.statusReasonCode = statusReasonCode;
	}

}
