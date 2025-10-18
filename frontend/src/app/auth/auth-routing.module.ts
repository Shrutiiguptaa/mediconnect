import { NgModule } from "@angular/core";
import { RouterModule, Routes } from "@angular/router";

const routes: Routes = [
  // {
  //   path: 'mediconnect/',
  //   loadChildren: () => import('../mediconnect/mediconnect.module').then((m) => m.MediconnectModule),
  // }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class AuthRoutingModule {}