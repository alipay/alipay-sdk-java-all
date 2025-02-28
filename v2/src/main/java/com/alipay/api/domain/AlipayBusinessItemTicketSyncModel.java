package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 景区门票同步
 *
 * @author auto create
 * @since 1.0, 2023-04-17 11:56:18
 */
public class AlipayBusinessItemTicketSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3876768393461526925L;

	/**
	 * 扩展信息
	 */
	@ApiListField("ext_info")
	@ApiField("scenic_ext_info")
	private List<ScenicExtInfo> extInfo;

	/**
	 * 门票名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 表示景区的id
	 */
	@ApiField("outer_scenic_id")
	private String outerScenicId;

	/**
	 * 门票商品id
	 */
	@ApiField("outer_ticket_id")
	private String outerTicketId;

	/**
	 * 商户userId
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 图片
	 */
	@ApiField("pic")
	private String pic;

	/**
	 * 景区小程序id
	 */
	@ApiField("scenic_app_id")
	private String scenicAppId;

	/**
	 * 服务商名称
	 */
	@ApiField("source_system")
	private String sourceSystem;

	/**
	 * 0：无效
1：有效
	 */
	@ApiField("status")
	private Long status;

	/**
	 * 商品在支付宝内的id
	 */
	@ApiField("ticket_goods_id")
	private String ticketGoodsId;

	/**
	 * 支付宝小程序的商品页面链接
	 */
	@ApiField("ticket_link")
	private String ticketLink;

	/**
	 * 更新时间
	 */
	@ApiField("ticket_modified_time")
	private Date ticketModifiedTime;

	/**
	 * 门票规格列表，可选项：成人票, 全价票
	 */
	@ApiListField("ticket_specs")
	@ApiField("string")
	private List<String> ticketSpecs;

	/**
	 * 门票类型
NORMAL("NORMAL","普通"), GROUP("GROUP","套票"), PERIOD("PERIOD","时段票"), REGION("REGION","区域票")
	 */
	@ApiField("ticket_type")
	private String ticketType;

	/**
	 * 更新信息
	 */
	@ApiField("update_msg")
	private String updateMsg;

	public List<ScenicExtInfo> getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(List<ScenicExtInfo> extInfo) {
		this.extInfo = extInfo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOuterScenicId() {
		return this.outerScenicId;
	}
	public void setOuterScenicId(String outerScenicId) {
		this.outerScenicId = outerScenicId;
	}

	public String getOuterTicketId() {
		return this.outerTicketId;
	}
	public void setOuterTicketId(String outerTicketId) {
		this.outerTicketId = outerTicketId;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getPic() {
		return this.pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}

	public String getScenicAppId() {
		return this.scenicAppId;
	}
	public void setScenicAppId(String scenicAppId) {
		this.scenicAppId = scenicAppId;
	}

	public String getSourceSystem() {
		return this.sourceSystem;
	}
	public void setSourceSystem(String sourceSystem) {
		this.sourceSystem = sourceSystem;
	}

	public Long getStatus() {
		return this.status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}

	public String getTicketGoodsId() {
		return this.ticketGoodsId;
	}
	public void setTicketGoodsId(String ticketGoodsId) {
		this.ticketGoodsId = ticketGoodsId;
	}

	public String getTicketLink() {
		return this.ticketLink;
	}
	public void setTicketLink(String ticketLink) {
		this.ticketLink = ticketLink;
	}

	public Date getTicketModifiedTime() {
		return this.ticketModifiedTime;
	}
	public void setTicketModifiedTime(Date ticketModifiedTime) {
		this.ticketModifiedTime = ticketModifiedTime;
	}

	public List<String> getTicketSpecs() {
		return this.ticketSpecs;
	}
	public void setTicketSpecs(List<String> ticketSpecs) {
		this.ticketSpecs = ticketSpecs;
	}

	public String getTicketType() {
		return this.ticketType;
	}
	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}

	public String getUpdateMsg() {
		return this.updateMsg;
	}
	public void setUpdateMsg(String updateMsg) {
		this.updateMsg = updateMsg;
	}

}
