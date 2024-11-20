package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 排名信息
 *
 * @author auto create
 * @since 1.0, 2021-12-29 14:59:12
 */
public class PointRankingInfo extends AlipayObject {

	private static final long serialVersionUID = 3741363144884821893L;

	/**
	 * 当前排名
	 */
	@ApiField("current_ranking")
	private Long currentRanking;

	/**
	 * 排名详情
	 */
	@ApiListField("ranking_list")
	@ApiField("ranking_detail_info")
	private List<RankingDetailInfo> rankingList;

	/**
	 * 排名总数
	 */
	@ApiField("total")
	private Long total;

	public Long getCurrentRanking() {
		return this.currentRanking;
	}
	public void setCurrentRanking(Long currentRanking) {
		this.currentRanking = currentRanking;
	}

	public List<RankingDetailInfo> getRankingList() {
		return this.rankingList;
	}
	public void setRankingList(List<RankingDetailInfo> rankingList) {
		this.rankingList = rankingList;
	}

	public Long getTotal() {
		return this.total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}

}
