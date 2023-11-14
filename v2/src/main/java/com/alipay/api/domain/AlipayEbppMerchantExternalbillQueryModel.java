package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外部账单查询
 *
 * @author auto create
 * @since 1.0, 2022-10-08 15:40:30
 */
public class AlipayEbppMerchantExternalbillQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4336111883734797449L;

	/**
	 * 小区短名, 小区创建时生成
	 */
	@ApiField("community_short_name")
	private String communityShortName;

	/**
	 * 页码数
	 */
	@ApiField("page_number")
	private Long pageNumber;

	/**
	 * 分页条数（最大200，默认100）
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 支付宝房间id
	 */
	@ApiField("room_id")
	private String roomId;

	/**
	 * 账单状态：
INIT(待缴)，WAIT_PAY(处理中)，FINISH_PAY(已缴)，FAIL(支付失败)，REFUND(异常退款)，INVALID(失效)，CHANNEL_FINISH_PAY（外部渠道支付）
	 */
	@ApiField("status")
	private String status;

	public String getCommunityShortName() {
		return this.communityShortName;
	}
	public void setCommunityShortName(String communityShortName) {
		this.communityShortName = communityShortName;
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}
	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getRoomId() {
		return this.roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
