package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建空间
 *
 * @author auto create
 * @since 1.0, 2019-05-22 14:31:07
 */
public class AlipayMarketingToolFengdieSpaceCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5161773918536248224L;

	/**
	 * 空间域名信息
	 */
	@ApiListField("domains")
	@ApiField("fengdie_space_domains")
	private List<FengdieSpaceDomains> domains;

	/**
	 * spm A 位
	 */
	@ApiField("spm_a")
	private String spmA;

	/**
	 * spm 业务类型
	 */
	@ApiField("spm_biz_type")
	private String spmBizType;

	/**
	 * 欲创建的空间名称。应注意云凤蝶中每个空间有唯一的空间名称，尽量使用自己平台的前缀。另外空间名称只允许是中英文字符数字下划线组成的字符串。
	 */
	@ApiField("title")
	private String title;

	public List<FengdieSpaceDomains> getDomains() {
		return this.domains;
	}
	public void setDomains(List<FengdieSpaceDomains> domains) {
		this.domains = domains;
	}

	public String getSpmA() {
		return this.spmA;
	}
	public void setSpmA(String spmA) {
		this.spmA = spmA;
	}

	public String getSpmBizType() {
		return this.spmBizType;
	}
	public void setSpmBizType(String spmBizType) {
		this.spmBizType = spmBizType;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
