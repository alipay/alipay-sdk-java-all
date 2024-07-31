package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 初始化家人信息档案(选人授权)组件
 *
 * @author auto create
 * @since 1.0, 2020-07-27 22:52:05
 */
public class AlipayUserFamilyArchiveInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 4111322644982384486L;

	/**
	 * 家庭档案id
	 */
	@ApiListField("archive_id_list")
	@ApiField("string")
	private List<String> archiveIdList;

	/**
	 * 最大选择家人档案数量，范围[0,10]区间
	 */
	@ApiField("max_archives_cnt")
	private Long maxArchivesCnt;

	/**
	 * 最小选择家人档案数量，范围[0,10]区间
	 */
	@ApiField("min_archives_cnt")
	private Long minArchivesCnt;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 授权回调地址，和应用在门户上设置的“授权回调地址”保持一致，必须满足URI规范，且不能携带参数
	 */
	@ApiField("redirect_uri")
	private String redirectUri;

	/**
	 * 家庭档案组件模板id，模板包括定制化的字段、定制化的展示文案和用户协议等等。每个业务方需要用户家人信息的字段不一样，核验的方式也会有差异，需要联系产品负责人申请
	 */
	@ApiField("template_id")
	private String templateId;

	public List<String> getArchiveIdList() {
		return this.archiveIdList;
	}
	public void setArchiveIdList(List<String> archiveIdList) {
		this.archiveIdList = archiveIdList;
	}

	public Long getMaxArchivesCnt() {
		return this.maxArchivesCnt;
	}
	public void setMaxArchivesCnt(Long maxArchivesCnt) {
		this.maxArchivesCnt = maxArchivesCnt;
	}

	public Long getMinArchivesCnt() {
		return this.minArchivesCnt;
	}
	public void setMinArchivesCnt(Long minArchivesCnt) {
		this.minArchivesCnt = minArchivesCnt;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getRedirectUri() {
		return this.redirectUri;
	}
	public void setRedirectUri(String redirectUri) {
		this.redirectUri = redirectUri;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
