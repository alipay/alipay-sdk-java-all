package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户参赛运动记录数据查询
 *
 * @author auto create
 * @since 1.0, 2024-07-08 17:03:09
 */
public class AlipayCommerceSportsOnlinegameUsergamedataQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7371595256633827583L;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 三方用户赛事业务号，取值为三方传入
	 */
	@ApiField("out_user_game_no")
	private String outUserGameNo;

	/**
	 * 页码
	 */
	@ApiField("page_index")
	private Long pageIndex;

	/**
	 * 页数量，单位条
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 文体侧用户赛事业务号，取值为问题赛事同步接口返回
	 */
	@ApiField("user_game_id")
	private String userGameId;

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

	public String getOutUserGameNo() {
		return this.outUserGameNo;
	}
	public void setOutUserGameNo(String outUserGameNo) {
		this.outUserGameNo = outUserGameNo;
	}

	public Long getPageIndex() {
		return this.pageIndex;
	}
	public void setPageIndex(Long pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getUserGameId() {
		return this.userGameId;
	}
	public void setUserGameId(String userGameId) {
		this.userGameId = userGameId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
