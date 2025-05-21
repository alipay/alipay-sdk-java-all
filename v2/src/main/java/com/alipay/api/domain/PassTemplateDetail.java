package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 卡券模板详请
 *
 * @author auto create
 * @since 1.0, 2019-08-08 20:04:24
 */
public class PassTemplateDetail extends AlipayObject {

	private static final long serialVersionUID = 6275698262178544495L;

	/**
	 * 模板创建时间，格式"yyyy-MM-dd HH:mm:ss"
	 */
	@ApiField("create_time")
	private String createTime;

	/**
	 * 模板最后修改时间，格式"yyyy-MM-dd HH:mm:ss"
	 */
	@ApiField("modify_time")
	private String modifyTime;

	/**
	 * 模板内容信息文本，遵循JSON规范，即创建模板时传入tpl_content字段；
详情参见tpl_content参数说明：https://doc.open.alipay.com/doc2/detail.htm?treeId=193&articleId=105249&docType=1#tpl_content
	 */
	@ApiField("tpl_content")
	private String tplContent;

	/**
	 * 模板ID（编号）
	 */
	@ApiField("tpl_id")
	private String tplId;

	/**
	 * 模板上定制的动态参数（变量）列表
	 */
	@ApiListField("tpl_params")
	@ApiField("string")
	private List<String> tplParams;

	public String getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getModifyTime() {
		return this.modifyTime;
	}
	public void setModifyTime(String modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getTplContent() {
		return this.tplContent;
	}
	public void setTplContent(String tplContent) {
		this.tplContent = tplContent;
	}

	public String getTplId() {
		return this.tplId;
	}
	public void setTplId(String tplId) {
		this.tplId = tplId;
	}

	public List<String> getTplParams() {
		return this.tplParams;
	}
	public void setTplParams(List<String> tplParams) {
		this.tplParams = tplParams;
	}

}
