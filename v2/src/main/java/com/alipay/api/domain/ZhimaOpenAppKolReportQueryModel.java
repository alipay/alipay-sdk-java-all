package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁达人合作中心转化数据查询接口
 *
 * @author auto create
 * @since 1.0, 2025-12-16 11:37:41
 */
public class ZhimaOpenAppKolReportQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7566439654394674571L;

	/**
	 * 领取口令词对应达人机构名
	 */
	@ApiField("corp_name")
	private String corpName;

	/**
	 * 查询转化报表截止日期（不含当日）
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 查询口令词
	 */
	@ApiField("search_word")
	private String searchWord;

	/**
	 * 查询转化报表开始日期
	 */
	@ApiField("start_date")
	private String startDate;

	public String getCorpName() {
		return this.corpName;
	}
	public void setCorpName(String corpName) {
		this.corpName = corpName;
	}

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getSearchWord() {
		return this.searchWord;
	}
	public void setSearchWord(String searchWord) {
		this.searchWord = searchWord;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

}
