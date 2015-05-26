package elasticsearch;

import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.node.Node;

import static org.elasticsearch.node.NodeBuilder.nodeBuilder;

/**
 * Created by yulu on 26/5/15.
 */
public class ElasticSearch {

  public static Client createWithDefaultConfig() {
    Node node = nodeBuilder().node();
    return node.client();
  }

  public static Client createLocalNode() {
    Node node = nodeBuilder().local(true).node();
    return node.client();
  }

  public static Client getLocalNode() {
    return new TransportClient().addTransportAddress(new InetSocketTransportAddress("localhost", 9300));
  }


}
