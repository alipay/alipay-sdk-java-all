package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 安心登记卡保单列表查询
 *
 * @author auto create
 * @since 1.0, 2026-07-28 15:42:50
 */
public class AlipayCommerceOfflinelaborInsuranceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1311669642765763479L;

	/**
	 * 支付宝账号，与channel_user_source
配对使用
	 */
	@ApiField("channel_user_id")
	private String channelUserId;

	/**
	 * 渠道账号来源，"1"
=支付宝账号
	 */
	@ApiField("channel_user_source")
	private String channelUserSource;

	/**
	 * 保险模式
	 */
	@ApiField("mode")
	private String mode;

	/**
	 * 渠道账号对应UID，与channel_user_source
配对使用
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 页码
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 每页条数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * null
	 */
	@ApiListField("product_list")
	@ApiField("string")
	private List<String> productList;

	/**
	 * 已出单:ISSUED
已退保:SURRENDERRED
	 */
	@ApiField("status")
	private String status;

	/**
	 * 搜索用户类型，
"1"=按商户搜索
	 */
	@ApiField("type")
	private String type;

	public String getChannelUserId() {
		return this.channelUserId;
	}
	public void setChannelUserId(String channelUserId) {
		this.channelUserId = channelUserId;
	}

	public String getChannelUserSource() {
		return this.channelUserSource;
	}
	public void setChannelUserSource(String channelUserSource) {
		this.channelUserSource = channelUserSource;
	}

	public String getMode() {
		return this.mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Long getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public List<String> getProductList() {
		return this.productList;
	}
	public void setProductList(List<String> productList) {
		this.productList = productList;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
