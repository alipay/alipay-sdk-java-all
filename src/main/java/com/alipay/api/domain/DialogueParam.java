package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 对话在阿里云侧的会话唯一标识，用于解语花request_id生成以及双方后续交互的唯一标识
 *
 * @author auto create
 * @since 1.0, 2022-05-20 11:34:53
 */
public class DialogueParam extends AlipayObject {

	private static final long serialVersionUID = 3563158772136295974L;

	/**
	 * 阿里云文件id
	 */
	@ApiField("file_id")
	private String fileId;

	/**
	 * 阿里云任务id 和文件id配合构建双方交互唯一标识
	 */
	@ApiField("task_id")
	private String taskId;

	public String getFileId() {
		return this.fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

}
