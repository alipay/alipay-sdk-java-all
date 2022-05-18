package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 组合消息模板领取接口
 *
 * @author auto create
 * @since 1.0, 2021-04-25 14:36:42
 */
public class AlipayOpenPublicTemplateMessageAddModel extends AlipayObject {

	private static final long serialVersionUID = 5255489795187384123L;

	/**
	 * 自行组合模板关键词列表，关键词顺序按数组顺序，关键字名称不能重复，最多支持5个，最少2个关键词组合
	 */
	@ApiListField("keyword_list")
	@ApiField("public_msg_keyword")
	private List<PublicMsgKeyword> keywordList;

	/**
	 * 消息母板id，登录 <a href="https://fuwu.alipay.com/platform/spa/merchant/main/index">生活号后台</a>，点击【消息与互动】菜单【模板消息】，即可看到/领取模板的消息母板id。
	 */
	@ApiField("lib_code")
	private String libCode;

	/**
	 * 可选字段的选择，开头语(name=first)，结束语(name=remark)以及图片(name=image)。选择使用的话则在入参中name中标识，不选用任何可选字段可不传。
	 */
	@ApiListField("opt_list")
	@ApiField("public_msg_keyword")
	private List<PublicMsgKeyword> optList;

	public List<PublicMsgKeyword> getKeywordList() {
		return this.keywordList;
	}
	public void setKeywordList(List<PublicMsgKeyword> keywordList) {
		this.keywordList = keywordList;
	}

	public String getLibCode() {
		return this.libCode;
	}
	public void setLibCode(String libCode) {
		this.libCode = libCode;
	}

	public List<PublicMsgKeyword> getOptList() {
		return this.optList;
	}
	public void setOptList(List<PublicMsgKeyword> optList) {
		this.optList = optList;
	}

}
