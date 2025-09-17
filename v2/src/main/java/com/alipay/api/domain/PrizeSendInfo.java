package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 任务发奖流水详情
 *
 * @author auto create
 * @since 1.0, 2023-10-12 20:46:28
 */
public class PrizeSendInfo extends AlipayObject {

	private static final long serialVersionUID = 7139889686787125882L;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 发奖系数
	 */
	@ApiField("modulus")
	private Long modulus;

	/**
	 * openid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 奖品价格
	 */
	@ApiField("price")
	private String price;

	/**
	 * 奖品对客信息
	 */
	@ApiField("prize_custom_display_info")
	private PrizeCustomDisplayInfo prizeCustomDisplayInfo;

	/**
	 * 奖品id
	 */
	@ApiField("prize_id")
	private String prizeId;

	/**
	 * 奖品名称
	 */
	@ApiField("prize_name")
	private String prizeName;

	/**
	 * 奖品类型
	 */
	@ApiField("prize_type")
	private String prizeType;

	/**
	 * 发奖orderId，发奖流水id
	 */
	@ApiField("send_order_id")
	private String sendOrderId;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public Long getModulus() {
		return this.modulus;
	}
	public void setModulus(Long modulus) {
		this.modulus = modulus;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public PrizeCustomDisplayInfo getPrizeCustomDisplayInfo() {
		return this.prizeCustomDisplayInfo;
	}
	public void setPrizeCustomDisplayInfo(PrizeCustomDisplayInfo prizeCustomDisplayInfo) {
		this.prizeCustomDisplayInfo = prizeCustomDisplayInfo;
	}

	public String getPrizeId() {
		return this.prizeId;
	}
	public void setPrizeId(String prizeId) {
		this.prizeId = prizeId;
	}

	public String getPrizeName() {
		return this.prizeName;
	}
	public void setPrizeName(String prizeName) {
		this.prizeName = prizeName;
	}

	public String getPrizeType() {
		return this.prizeType;
	}
	public void setPrizeType(String prizeType) {
		this.prizeType = prizeType;
	}

	public String getSendOrderId() {
		return this.sendOrderId;
	}
	public void setSendOrderId(String sendOrderId) {
		this.sendOrderId = sendOrderId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
