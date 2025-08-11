package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商家群活动详情模型
 *
 * @author auto create
 * @since 1.0, 2025-03-06 15:40:12
 */
public class GroupActivityDetailVO extends AlipayObject {

	private static final long serialVersionUID = 4171474153539985257L;

	/**
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 展位位置 群福利(group_welfare),热门推荐(hot_recommend),群内消息卡片(group_msg_card)
	 */
	@ApiField("client_position")
	private String clientPosition;

	/**
	 * 优惠群活动顶部运营位内容
	 */
	@ApiField("coupon_content")
	private CouponActivityContentVO couponContent;

	/**
	 * 自定义活动顶部运营位内容
	 */
	@ApiField("custom_content")
	private CustomActivityContentVO customContent;

	/**
	 * 活动截止时间
	 */
	@ApiField("gmt_end")
	private Date gmtEnd;

	/**
	 * 活动开始时间
	 */
	@ApiField("gmt_start")
	private Date gmtStart;

	/**
	 * 商品活动顶部运营位内容
	 */
	@ApiField("goods_content")
	private GoodsActivityContentVO goodsContent;

	/**
	 * 商家群活动id
	 */
	@ApiField("group_activity_id")
	private String groupActivityId;

	/**
	 * 群组id列表，创建群组时对应的一个群组id
	 */
	@ApiListField("group_ids")
	@ApiField("string")
	private List<String> groupIds;

	/**
	 * 展示优先级 1-5, 数字越大优先级越高
	 */
	@ApiField("priority")
	private Long priority;

	/**
	 * 商家群活动状态 INIT(初始化), CC_AUDITING(安全审核中), CC(安全审核驳回), PENDING(待生效), VALID(生效), SUSPEND(暂停), STOPPED(结束)
	 */
	@ApiField("status")
	private String status;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getClientPosition() {
		return this.clientPosition;
	}
	public void setClientPosition(String clientPosition) {
		this.clientPosition = clientPosition;
	}

	public CouponActivityContentVO getCouponContent() {
		return this.couponContent;
	}
	public void setCouponContent(CouponActivityContentVO couponContent) {
		this.couponContent = couponContent;
	}

	public CustomActivityContentVO getCustomContent() {
		return this.customContent;
	}
	public void setCustomContent(CustomActivityContentVO customContent) {
		this.customContent = customContent;
	}

	public Date getGmtEnd() {
		return this.gmtEnd;
	}
	public void setGmtEnd(Date gmtEnd) {
		this.gmtEnd = gmtEnd;
	}

	public Date getGmtStart() {
		return this.gmtStart;
	}
	public void setGmtStart(Date gmtStart) {
		this.gmtStart = gmtStart;
	}

	public GoodsActivityContentVO getGoodsContent() {
		return this.goodsContent;
	}
	public void setGoodsContent(GoodsActivityContentVO goodsContent) {
		this.goodsContent = goodsContent;
	}

	public String getGroupActivityId() {
		return this.groupActivityId;
	}
	public void setGroupActivityId(String groupActivityId) {
		this.groupActivityId = groupActivityId;
	}

	public List<String> getGroupIds() {
		return this.groupIds;
	}
	public void setGroupIds(List<String> groupIds) {
		this.groupIds = groupIds;
	}

	public Long getPriority() {
		return this.priority;
	}
	public void setPriority(Long priority) {
		this.priority = priority;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
