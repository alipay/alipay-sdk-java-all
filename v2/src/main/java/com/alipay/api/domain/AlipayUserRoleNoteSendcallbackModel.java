package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 颜选数据采购
 *
 * @author auto create
 * @since 1.0, 2026-05-26 14:22:46
 */
public class AlipayUserRoleNoteSendcallbackModel extends AlipayObject {

	private static final long serialVersionUID = 7491512892625292552L;

	/**
	 * 笔记类型
	 */
	@ApiField("note_callback_type")
	private String noteCallbackType;

	/**
	 * 笔记明细数据
	 */
	@ApiField("note_detail")
	private String noteDetail;

	/**
	 * 请求参数
	 */
	@ApiField("note_req_params")
	private String noteReqParams;

	/**
	 * 采集任务
	 */
	@ApiField("note_task_id")
	private String noteTaskId;

	public String getNoteCallbackType() {
		return this.noteCallbackType;
	}
	public void setNoteCallbackType(String noteCallbackType) {
		this.noteCallbackType = noteCallbackType;
	}

	public String getNoteDetail() {
		return this.noteDetail;
	}
	public void setNoteDetail(String noteDetail) {
		this.noteDetail = noteDetail;
	}

	public String getNoteReqParams() {
		return this.noteReqParams;
	}
	public void setNoteReqParams(String noteReqParams) {
		this.noteReqParams = noteReqParams;
	}

	public String getNoteTaskId() {
		return this.noteTaskId;
	}
	public void setNoteTaskId(String noteTaskId) {
		this.noteTaskId = noteTaskId;
	}

}
