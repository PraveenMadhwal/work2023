{
  "appId": "ca7a63bc-fd33-4726-9cc6-7f88eb4950a9",
  "displayName": "adm-sevice-principal",
  "password": "Q4x8Q~fuBxyOvlH14d7H.VsF19KghJtEiwRgaa33",
  "tenant": "a24e1a43-ccf2-4d14-8e00-362e06f16cdb"
}


1) azure cmd:az ad sp create-for-rbac --name adm-sevice-principal --role Owner --scopes /subscriptions/ff4aa5ce-9ea8-41fc-b9df-d13f96a9520c
2) az webapp deploy --resource-group pm-group --name spingbootwebapp --src-path ./<package-name>.war
3) az webapp stop --resource-group pm-group  --name sprinbootwebapp