#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
const int maxn = 1e5 + 14;
int n, m, st, t;
ll d[maxn];
struct Edge{
	int u, w;
	ll t;
};
vector<Edge> g[maxn];
int ver[maxn];
int main(){
	ios::sync_with_stdio(0), cin.tie(0);
	cin >> n >> m;
	while(m--){
		int sz;
		ll t;
		cin >> sz >> t;
		for(int i = 0; i < sz; i++)
			cin >> ver[i], ver[i]--;
		for(int i = 0; i < sz - 1; i++){
			int w;
			cin >> w;
			g[ ver[i] ].push_back({ver[i + 1], w, t});
			t += w;
		}
	}
	cin >> st >> t;
	st--, t--;
	memset(d, 63, sizeof d);
	d[st] = 0;
	set<pair<ll, int> > s({{d[st], st}});
	while(s.size()){
		int v = s.begin() -> second;
		if(v == t)
			return cout << d[v] << '\n', 0;
		s.erase(s.begin());
		for(auto edge : g[v])
			if(d[v] <= edge.t && d[edge.u] > d[v] + edge.w){
				s.erase({d[edge.u], edge.u});
				d[edge.u] = d[v] + edge.w;
				s.insert({d[edge.u], edge.u});
			}
	}
	cout << "-1\n";
}
