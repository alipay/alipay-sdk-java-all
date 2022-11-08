package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 阿里云保险管家对话同步审核接口
 *
 * @author auto create
 * @since 1.0, 2022-10-12 10:38:13
 */
public class AlipayFincoreComplianceRcsmartQtdialogueCheckModel extends AlipayObject {

	private static final long serialVersionUID = 2345247548796116636L;

	/**
	 * app_name为调用方系统名称(英文名称),与分配的app_token一起做调用系统合法性校验。
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * app_token为系统分配的密钥，与app_name一起做调用系统合法性校验
	 */
	@ApiField("app_token")
	private String appToken;

	/**
	 * 业务编码，一个业务biz_code代表当前业务，可以包含多个scene_code，与scene_code之间为一对多的关系。
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 阿里云和解语花交互的对话审核请求的唯一标识
	 */
	@ApiField("dialogue_param")
	private DialogueParam dialogueParam;

	/**
	 * 对话内容列表
	 */
	@ApiListField("dialogues")
	@ApiField("dialogue")
	private List<Dialogue> dialogues;

	/**
	 * 场景编码。内容审核业务对应的场景代码。
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getAppToken() {
		return this.appToken;
	}
	public void setAppToken(String appToken) {
		this.appToken = appToken;
	}

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public DialogueParam getDialogueParam() {
		return this.dialogueParam;
	}
	public void setDialogueParam(DialogueParam dialogueParam) {
		this.dialogueParam = dialogueParam;
	}

	public List<Dialogue> getDialogues() {
		return this.dialogues;
	}
	public void setDialogues(List<Dialogue> dialogues) {
		this.dialogues = dialogues;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
