package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 直播弹幕游戏推送数据（点赞/评论/礼物）
 *
 * @author auto create
 * @since 1.0, 2024-07-23 15:59:30
 */
public class DanmuGameData extends AlipayObject {

	private static final long serialVersionUID = 8598992995795563296L;

	/**
	 * 评论内容
	 */
	@ApiListField("content")
	@ApiField("string")
	private List<String> content;

	/**
	 * 点赞数量
	 */
	@ApiField("count")
	private Long count;

	/**
	 * 礼物数量
	 */
	@ApiField("gift_count")
	private Long giftCount;

	/**
	 * 礼物id
	 */
	@ApiField("gift_id")
	private String giftId;

	/**
	 * 礼物名称
	 */
	@ApiField("gift_name")
	private String giftName;

	/**
	 * 礼物总价值，单位钻石（1元=10钻石）
	 */
	@ApiField("gift_total_price")
	private Long giftTotalPrice;

	/**
	 * 礼物单价，单位钻石（1元=10钻石）
	 */
	@ApiField("gift_unit_price")
	private Long giftUnitPrice;

	/**
	 * 单号，一个单号代表一笔送收礼, 幂等消费
	 */
	@ApiField("unique_no")
	private String uniqueNo;

	/**
	 * 用户信息
	 */
	@ApiField("user_info")
	private DanmuGameUserInfo userInfo;

	public List<String> getContent() {
		return this.content;
	}
	public void setContent(List<String> content) {
		this.content = content;
	}

	public Long getCount() {
		return this.count;
	}
	public void setCount(Long count) {
		this.count = count;
	}

	public Long getGiftCount() {
		return this.giftCount;
	}
	public void setGiftCount(Long giftCount) {
		this.giftCount = giftCount;
	}

	public String getGiftId() {
		return this.giftId;
	}
	public void setGiftId(String giftId) {
		this.giftId = giftId;
	}

	public String getGiftName() {
		return this.giftName;
	}
	public void setGiftName(String giftName) {
		this.giftName = giftName;
	}

	public Long getGiftTotalPrice() {
		return this.giftTotalPrice;
	}
	public void setGiftTotalPrice(Long giftTotalPrice) {
		this.giftTotalPrice = giftTotalPrice;
	}

	public Long getGiftUnitPrice() {
		return this.giftUnitPrice;
	}
	public void setGiftUnitPrice(Long giftUnitPrice) {
		this.giftUnitPrice = giftUnitPrice;
	}

	public String getUniqueNo() {
		return this.uniqueNo;
	}
	public void setUniqueNo(String uniqueNo) {
		this.uniqueNo = uniqueNo;
	}

	public DanmuGameUserInfo getUserInfo() {
		return this.userInfo;
	}
	public void setUserInfo(DanmuGameUserInfo userInfo) {
		this.userInfo = userInfo;
	}

}
