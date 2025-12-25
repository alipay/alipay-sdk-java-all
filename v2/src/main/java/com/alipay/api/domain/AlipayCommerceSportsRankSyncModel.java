package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 亚运奖牌排行同步
 *
 * @author auto create
 * @since 1.0, 2023-09-15 11:54:10
 */
public class AlipayCommerceSportsRankSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5413954566858124844L;

	/**
	 * 外部排行榜Id，用于区分不同场景下的排行榜信息
	 */
	@ApiField("out_ranking_id")
	private String outRankingId;

	/**
	 * 榜单成员列表
	 */
	@ApiListField("rank_members")
	@ApiField("rank_member_info")
	private List<RankMemberInfo> rankMembers;

	/**
	 * 榜单名称 如：亚运奖牌排行榜
	 */
	@ApiField("ranking_name")
	private String rankingName;

	public String getOutRankingId() {
		return this.outRankingId;
	}
	public void setOutRankingId(String outRankingId) {
		this.outRankingId = outRankingId;
	}

	public List<RankMemberInfo> getRankMembers() {
		return this.rankMembers;
	}
	public void setRankMembers(List<RankMemberInfo> rankMembers) {
		this.rankMembers = rankMembers;
	}

	public String getRankingName() {
		return this.rankingName;
	}
	public void setRankingName(String rankingName) {
		this.rankingName = rankingName;
	}

}
