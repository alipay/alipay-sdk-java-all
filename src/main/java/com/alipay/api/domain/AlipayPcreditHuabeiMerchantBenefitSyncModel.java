package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 花呗美味券状态同步接口
 *
 * @author auto create
 * @since 1.0, 2022-08-23 11:20:52
 */
public class AlipayPcreditHuabeiMerchantBenefitSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6212999218299568346L;

	/**
	 * 支付宝统一用户id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 额外信息 Map JSON格式 {"k1":"v1","k2":"v2"}
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 操作时间
	 */
	@ApiField("gmt_operate")
	private Date gmtOperate;

	/**
	 * 花呗侧权益实例id
	 */
	@ApiField("hb_instance_id")
	private String hbInstanceId;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 权益状态 0:正常 1:已使用 2:退款中 3:退款成功 4:已过期
	 */
	@ApiField("status")
	private Long status;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public Date getGmtOperate() {
		return this.gmtOperate;
	}
	public void setGmtOperate(Date gmtOperate) {
		this.gmtOperate = gmtOperate;
	}

	public String getHbInstanceId() {
		return this.hbInstanceId;
	}
	public void setHbInstanceId(String hbInstanceId) {
		this.hbInstanceId = hbInstanceId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

}
