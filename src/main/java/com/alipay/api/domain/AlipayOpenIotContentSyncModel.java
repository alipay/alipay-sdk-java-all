package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * IoT外部商户内容同步
 *
 * @author auto create
 * @since 1.0, 2022-10-12 10:24:41
 */
public class AlipayOpenIotContentSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5333635624726336881L;

	/**
	 * 同步内容列表，格式取决于同步数据的场景
	 */
	@ApiListField("content_list")
	@ApiField("string")
	private List<String> contentList;

	/**
	 * 请求ID，标识唯一一次请求，串联调用方的内部链路
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 场景码，用于指定当前同步数据所属的业务场景
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public List<String> getContentList() {
		return this.contentList;
	}
	public void setContentList(List<String> contentList) {
		this.contentList = contentList;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
