package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 花呗会员等级查询
 *
 * @author auto create
 * @since 1.0, 2026-06-30 10:42:55
 */
public class AlipayPcreditHuabeiMemberGradeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4429753535735499117L;

	/**
	 * 查询业务发生时间
	 */
	@ApiField("biz_time")
	private Date bizTime;

	/**
	 * 商户名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 用户id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部业务号。用作幂等控制，注意同步不同的状态时，外部业务号必须不同，否则会被幂等掉，无法正确同步数据。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 注册渠道编码
	 */
	@ApiField("register_channel")
	private String registerChannel;

	/**
	 * 业务场景，由支付宝分配，具体值由支付宝定义：
D2D：高铁接站场景
INTERFLOW_PARTNER_MEMBER：互通联名会员场景
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 当pid无法区分商家时，合作商家需要传递此字段
	 */
	@ApiField("vendor")
	private String vendor;

	public Date getBizTime() {
		return this.bizTime;
	}
	public void setBizTime(Date bizTime) {
		this.bizTime = bizTime;
	}

	public String getMerchantName() {
		return this.merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
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

	public String getRegisterChannel() {
		return this.registerChannel;
	}
	public void setRegisterChannel(String registerChannel) {
		this.registerChannel = registerChannel;
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

	public String getVendor() {
		return this.vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

}
