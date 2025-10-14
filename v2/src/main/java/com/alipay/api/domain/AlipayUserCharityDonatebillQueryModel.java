package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询用户在支付宝公益捐赠交易流水接口
 *
 * @author auto create
 * @since 1.0, 2024-09-13 13:32:09
 */
public class AlipayUserCharityDonatebillQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4541663366258762683L;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 分页查询的当前页数，不能小于1
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每批分页查询的数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
