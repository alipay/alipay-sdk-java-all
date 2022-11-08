package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 次卡使用记录查询
 *
 * @author auto create
 * @since 1.0, 2022-09-27 17:25:58
 */
public class AlipayCommerceOperationTimescardUselogBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2348353996815518884L;

	/**
	 * 卡号
	 */
	@ApiField("card_id")
	private String cardId;

	/**
	 * 记录结束时间
	 */
	@ApiField("log_time_end")
	private String logTimeEnd;

	/**
	 * 记录开始时间
	 */
	@ApiField("log_time_start")
	private String logTimeStart;

	/**
	 * 分页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页size
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 场景码
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getCardId() {
		return this.cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getLogTimeEnd() {
		return this.logTimeEnd;
	}
	public void setLogTimeEnd(String logTimeEnd) {
		this.logTimeEnd = logTimeEnd;
	}

	public String getLogTimeStart() {
		return this.logTimeStart;
	}
	public void setLogTimeStart(String logTimeStart) {
		this.logTimeStart = logTimeStart;
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

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
