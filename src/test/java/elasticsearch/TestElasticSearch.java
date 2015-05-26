package elasticsearch;

import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.search.SearchType;
import org.elasticsearch.client.Client;
import org.elasticsearch.index.query.FilterBuilders;
import org.elasticsearch.index.query.QueryBuilders;

/**
 * Created by yulu on 26/5/15.
 */
public class TestElasticSearch {
  public static void main(String[] args) {
    Client elasticSearchClient = ElasticSearch.getLocalNode();

    SearchResponse response = elasticSearchClient.prepareSearch("logstash-2015.05.21")
      .setQuery(QueryBuilders.matchQuery("method", "POST"))
      .execute().actionGet();

    System.out.println(response);
  }
}
