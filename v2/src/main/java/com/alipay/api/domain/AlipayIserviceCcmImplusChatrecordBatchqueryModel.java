package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询在线人机和人人聊天记录
 *
 * @author auto create
 * @since 1.0, 2025-10-10 13:48:27
 */
public class AlipayIserviceCcmImplusChatrecordBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 7175927162278338413L;

	/**
	 * 传递参数id
	 */
	@ApiField("ccs_instance_id")
	private String ccsInstanceId;

	/**
	 * 用于管理用户聊天会话
	 */
	@ApiField("cid")
	private String cid;

	/**
	 * 如果为0，则向前拉取消息
	 */
	@ApiField("cursor_id")
	private Long cursorId;

	/**
	 * FORWARD-向前 BACK-向后,默认向前
	 */
	@ApiField("direction")
	private String direction;

	/**
	 * 不填则拉取完才会结束
	 */
	@ApiField("end_id")
	private Long endId;

	/**
	 * 默认20条
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getCcsInstanceId() {
		return this.ccsInstanceId;
	}
	public void setCcsInstanceId(String ccsInstanceId) {
		this.ccsInstanceId = ccsInstanceId;
	}

	public String getCid() {
		return this.cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}

	public Long getCursorId() {
		return this.cursorId;
	}
	public void setCursorId(Long cursorId) {
		this.cursorId = cursorId;
	}

	public String getDirection() {
		return this.direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}

	public Long getEndId() {
		return this.endId;
	}
	public void setEndId(Long endId) {
		this.endId = endId;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
